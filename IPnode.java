
package javaapplication7;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IPnode extends SoCcomponent{
    
    Clock theClock;
    Gui theGui;
    IP type;
    int IPcoreNo;
    Buffer incomingMessage = new Buffer(100000); // one hundred thousand flits         
    Switch theSwitch;    
    int flitsLeft = 0;
    Flit theFlit = new Flit(); 
    Csv csv;
   
    Csv probeCsv;
    
    TaskBuffer theTasks = new TaskBuffer(1000);
    
    Task theTask;
 
    boolean messageCompleted = true;

    boolean injectingPackets = true;
    
    int numSideChannelHits = 0;
    
    IPnode(IP theType, int coreNo) throws IOException {
               
        type = theType;
        
        IPcoreNo = coreNo;
 
        csv = new Csv(coreNo);

        csv.setupCSV();
        
    }
    
        
    long packetInjectionDelay = -1;
       
    void risingEdge() { 
        
        timerNoContentionCheck++;
        
        if (timerNoContentionCheck > 100) timerNoContentionCheck = 0;

        checkMessageBuffer();
        
        if (theSwitch.injectionRequest == true) packetInjectionDelay++;

    }
    
    void fallingEdge() {    
        
        checkBufferCapacity();
    } 
    
    long timePacketSent, packetLatency = 0;
    
    Flit header = new Flit();
    
    int packetCount = 0; int tally[] = new int[52];
    
   
    void eject(Flit aFlit){
     
        incomingMessage.write(aFlit);
        
        String type ="";
   
        if (aFlit.headerFlit) {
            
            type = "H";
            
            header = aFlit;
 
            if (aFlit.sourceNode == 32 && (aFlit.injectionDelay>0) && (aFlit.destNode == 34) ){
                                
                checkNoContentionTable(aFlit);
            }
           
        }
        if (aFlit.bodyFlit) type = "B";
        
        if (aFlit.tailFlit) {
            
            packetLatency = theClock.cycles - aFlit.timeHeaderSent;
            
            type = "T";
            
            
            
            if (startOfSideChannel!=0 ) {
                
                endOfSideChannel = aFlit.timeHeaderSent+2;
                
                csv.logToCsv( aFlit.timeHeaderSent, theClock.cycles,   
                header.injectionDelay, packetLatency, header.sourceNode, header.destNode, startOfSideChannel, endOfSideChannel); 
                
                double sizeOfSideChannel = endOfSideChannel - startOfSideChannel;
                
//                System.out.println(sizeOfSideChannel + " = side channel duration in cc");

            }
            
            if (aFlit.destNode!= 34) {
                
                csv.logToCsv( aFlit.timeHeaderSent, theClock.cycles,   
                header.injectionDelay, packetLatency, header.sourceNode, header.destNode, startOfSideChannel, endOfSideChannel); 


            }

            startOfSideChannel = 0;
        
            endOfSideChannel = 0;
       
            packetCount++;

            tally[header.sourceNode] ++;


        }
                   
            theGui.setTable(IPcoreNo, type, aFlit.injectionDelay, aFlit.timeSent, theClock.cycles, theClock.cycles - aFlit.timeSent, aFlit.sourceNode, 
            aFlit.destNode, packetLatency);   
     
            packetLatency = 0;
    }

    void checkBufferCapacity() {
        
        if (incomingMessage.numberOfElements() > 9500) {
            
            incomingMessage.queueA.clear();
        }
    }
    
    long delay = 0; 

    boolean sendingMessage = false; boolean bootUP = true;
    
    void checkMessageBuffer() { 
       
        if (bootUP  && theTasks.numberOfElements()!=0) {
            
            theTask = theTasks.read(); theTasks.write(theTask);             

            delay = theTask.period;
            
            bootUP = false;
        }

        if (delay < 1 && theTasks.numberOfElements()!=0 ) {

          theTask = theTasks.read(); theTasks.write(theTask);             

          delay = theTask.period; 

          messageCompleted = false;

        }

          if (!messageCompleted && !sendingMessage ) {
   
              theTask.timeSent = theClock.cycles;
                     
              sendMessage();
            
              sendingMessage = true;
             
          } 

          if (theTasks.numberOfElements()!=0) delay--;
          
          
    }
        
    void loadMessage( Task theMessage ) {    
        
        theTasks.write(theMessage);
    }
   
    void closeCSV () {
         try {
                    csv.csvWriter.close();
         } catch (IOException ex) {
                    Logger.getLogger(IPnode.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    int packetsSent = 0;
    
    int totalPacketsSent = 0;
  
    int flitsSent = 0;
    
    long [][] noContentionTable = new long [10000][2]; // start, finish
           
        long startOfSideChannel = 0;
        
        long endOfSideChannel = 0;
        
        int timerNoContentionCheck = 0;
        
        long temp = 0;
    
    
    void checkNoContentionTable(Flit f) { 
        
        // this is a header flit
        
        // check for Target node receiving data when probe at node B is experiencing no contention
       
        long startDelay = 0;

        startDelay = f.timeHeaderSent - f.injectionDelay;
        
        long probeSentFrom32 = startDelay+4;   // 4 clock cycles for the two hops to node 34
        
        long endDelay = f.timeHeaderSent;
        
        int tableRow = 0;
        
        boolean startFound = false;
        
        while (tableRow<1000) {
                                           
                    for (int i=0; i<=f.injectionDelay; i++) {
                    
                        if ( 
                                probeSentFrom32+i >= noContentionTable[tableRow][0] 
                            
                                && probeSentFrom32+i <= noContentionTable[tableRow][1]
                               
                           )

                        {  
                           // you have a side channel hit at the injection delay lasting up to 3 cycles as probes are 3 flits long

                             if (!startFound) {
                                                                  
                                 startOfSideChannel = probeSentFrom32 +i ;
                                 
                                 startOfSideChannel = startOfSideChannel - 19;                               
                                 
                                 startFound = true;
                                 
                                 theGui.setProbeTable (startDelay, f.timeHeaderSent, startOfSideChannel);
                             }  

                             numSideChannelHits++;
                           
                        }
                    
                     }
                    
                    tableRow++;
                     
            }
                   
        }
    
    
    // perform packetization
    
    void sendMessage() {   
     
        flitsLeft = theTask.numberOfFlits;
        
        theSwitch.injectionRequest = true;

    }
    
 
    int noContentionTableIndex = 0;

    boolean noContention = false;
 
    Flit sendPacket() {
        
        Flit aFlit = new Flit();
                    
            aFlit.sourceNode = theTask.source_node; 
                
            aFlit.destNode = theTask.dest_node;
            
            aFlit.numFlitsTotal = theTask.numberOfFlits;
            
            aFlit.timeHeaderSent = theClock.cycles;
            
            aFlit.injectionDelay = packetInjectionDelay;            
       
        if (theTask.flits[flitsSent] == "H") {

            aFlit.headerFlit = true;
           
            if ( aFlit.sourceNode == 34 && packetInjectionDelay == 0 ) {

                   noContentionTable[noContentionTableIndex][0] = theClock.cycles; // start

                   noContention = true;
            } 

}                          
                
        if (theTask.flits[flitsSent] == "B") {

            aFlit.bodyFlit = true;

        }
        
     
        if (theTask.flits[flitsSent] == "T" ) {
            
            aFlit.tailFlit = true;
            
            packetsSent++;
            totalPacketsSent++;

            theGui.updateStatus(IPcoreNo, " ");
            theGui.updatePacketsSent(IPcoreNo, packetsSent);
            theGui.updateFlitsInPacket( IPcoreNo, 0);
        
            if (aFlit.sourceNode==34 && noContention ) {
                    
                    noContentionTable[noContentionTableIndex][1] = theClock.cycles; // end 
                    
                    noContentionTableIndex++;
                    
                    if (noContentionTableIndex>999) {

                        noContentionTableIndex = 0;
                    }
                    
                    noContention = false;
                }
            
            
            packetInjectionDelay = -1;
            
        }
           
            aFlit.timeSent = theClock.cycles; 
            
            flitsLeft--;
            flitsSent++;           
            
            theGui.updateFlitsInMessage(IPcoreNo, flitsLeft);
            
                
            if (flitsLeft < 1) {
                
                theGui.updateFlitsInPacket( IPcoreNo, 0);

                theSwitch.injectionRequest = false;
                        
                messageCompleted = true;
                
                sendingMessage = false;
   
                flitsSent = 0; 
          
            }   
            
            theGui.updateFlitsSent(IPcoreNo, flitsSent);
       
        return aFlit;
    }
}

    
     

