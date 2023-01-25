
package javaapplication7;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.BitSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Switch extends SoCcomponent{
    
    Buffer extensionBuffer = new Buffer(10);
    Gui theGui; 
    Clock theClock;
     
    Buffer inputBuffer = new Buffer(1);
    Buffer outputBuffer = new Buffer(1);
    Flit aFlit;
    IPnode ipcore;
    Link outgoinglink = new Link(); 
    Link incominglink = new Link();
    int nodeNo;
    int flitsEjected = 0;
    int packetsReceived = 0;  
    
    boolean ejecting = false;
    boolean injectionRequest = false;
    boolean injecting = false;
    boolean injectionReady = true;
    boolean incoming = false;
    boolean endInjection = false;        
    
    boolean drivingFromInput = false;           
    boolean drivingFromExb = false;       
    boolean drivingFromOutput = false; 
        
    public static void print(String s) {
        
        System.out.println(s);
    }
        
    Switch (int no) {
        
        nodeNo = no;      
    }

    void risingEdge() {

        checkOutputBuffer();         
        
        checkExBuffer(); 
                
        checkInputBuffer(); 

        checkIncomingLink();
        
        checkInjection();  
        
    }
    
        void fallingEdge() {

        driveLink();
           
    }      
        
    void checkOutputBuffer() {
        
        drivingFromOutput = false;
        
        if (outputBuffer.numberOfElements()==1) {
          
            outputFlitToBeDriven = outputBuffer.read();
            
            drivingFromOutput = true;
            
        }
    }

    
    void checkExBuffer() {
        
        drivingFromExb = false;    
              
        if (extensionBuffer.numberOfElements()>0 && !drivingFromOutput ) {
            
            ExbFlitToBeDriven = extensionBuffer.read();
            
            drivingFromExb = true;
            
            
            ExbFlitToBeDriven.timeInExb = ExbFlitToBeDriven.timeInExb + (theClock.cycles - destination33exbArrivaltime);
                  
        }
    }

    Flit InputFlitToBeDriven;
    Flit outputFlitToBeDriven;
    Flit ExbFlitToBeDriven;
    
    long destination33exbTime = 0;
    
    long destination33exbArrivaltime = 0;
    
    
    void checkInputBuffer() {
        
            drivingFromInput = false;

            if (inputBuffer.numberOfElements()==1) {

                Flit inputFlit = inputBuffer.read();
                                               
                if (inputFlit.headerFlit == true && inputFlit.destNode == nodeNo) {

                    ejecting = true;

                }
                
                if ( !ejecting ) {
                    
                    if ( injecting || drivingFromExb || drivingFromOutput) { 
                        
                        
                    destination33exbArrivaltime = theClock.cycles -1;
                
                  
                    extensionBuffer.write(inputFlit);

                  }
                }

                if ( !ejecting && !drivingFromExb && !injecting && !drivingFromOutput) {

                   InputFlitToBeDriven = inputFlit;
                   
                   drivingFromInput = true;

                }  
                
                if (ejecting) {
                    
                    ejection(inputFlit);

                    if (inputFlit.tailFlit) ejecting = false;
                }
                
            }   
}

    void checkIncomingLink() {
        
        incoming = false;

        if (incominglink.transmitSignal) {
            
            incoming = true;
            
            Flit incomingFlit = incominglink.sample();
            
            inputBuffer.write(incomingFlit);

        }
       
    }          


    void  ejection(Flit aFlit) {

            ipcore.eject(aFlit);

            
            if (aFlit.tailFlit == true) {

                packetsReceived++;
            }
            
            flitsEjected++;  
    }
    
        void checkInjection() {

        if (injectionRequest && !drivingFromInput && !drivingFromExb && extensionBuffer.numberOfElements()==0 ) {
            
            injecting = true; 
           
        }
           
        if (injecting && ipcore.flitsLeft > 0) {
            
            Flit f = ipcore.sendPacket();
           
            if (f.tailFlit == true)  injecting = false;
          
            outputBuffer.write(f);
              
        }

    }
   
    
    void driveLink() {
        
                if (drivingFromInput) {
                    
                    outgoinglink.drive(InputFlitToBeDriven);
                    
//                    if (this.ipcore.IPcoreNo == 32 && InputFlitToBeDriven.headerFlit == true) System.out.println(InputFlitToBeDriven.sourceNode + " at cc = " + theClock.cycles);
                  

                }
                if (drivingFromOutput) {
                    
                   outgoinglink.drive(outputFlitToBeDriven);
                   
//                   if (this.ipcore.IPcoreNo == 32 && outputFlitToBeDriven.headerFlit == true) System.out.println(outputFlitToBeDriven.sourceNode + " at cc = " + theClock.cycles);


                }
                
                if (drivingFromExb) {
                    
                    outgoinglink.drive(ExbFlitToBeDriven);
                    
//                   if (this.ipcore.IPcoreNo == 32 && ExbFlitToBeDriven.headerFlit == true) System.out.println(ExbFlitToBeDriven.sourceNode + " at cc = " + theClock.cycles);

       }     
    }
}

        
       
               

