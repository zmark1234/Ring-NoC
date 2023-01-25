

package javaapplication7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Csv {

    FileWriter csvWriter = null;
    
    int theCore;
    
    Csv(int coreNum) throws IOException {
        
        theCore = coreNum;
        
        csvWriter = new FileWriter("csv node "+coreNum + ".csv");
        
    }
    
     void setupCSV() {
         
     try {
      
            csvWriter.append("send Time");
            csvWriter.append(", ");
            csvWriter.append("arrival Time");
            csvWriter.append(", ");
            csvWriter.append("injection delay");
            csvWriter.append(", ");
            csvWriter.append("packet latency");
            csvWriter.append(", ");
            csvWriter.append("source node");            
            csvWriter.append(", ");                       
            csvWriter.append("destination node");
            csvWriter.append(", ");
            csvWriter.append("side channel start");            
            csvWriter.append(", ");                       
            csvWriter.append("side channel end");            
            csvWriter.append("\n\n");
            
            csvWriter.flush();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Switch.class.getName()).log(Level.SEVERE, null, ex);
    }
     }

        
        void logToCsv(long sendTime, long arrivalTime, long injectingDelay, long packetLatency, int sourceNode, int destinationNode, long sideChannelStart, long sideChannelEnd) {
         
        try {
            
            csvWriter.append(Long.toString(sendTime));
            csvWriter.append(",");
            csvWriter.append(Long.toString(arrivalTime));
            csvWriter.append(",");
            csvWriter.append(Long.toString(injectingDelay));
            csvWriter.append(","); 
            csvWriter.append(Long.toString(packetLatency));
            csvWriter.append(","); 
            csvWriter.append(Long.toString(sourceNode));
            csvWriter.append(",");             
            csvWriter.append(Long.toString(destinationNode)); 
            csvWriter.append(","); 
            csvWriter.append(Long.toString(sideChannelStart));
            csvWriter.append(",");             
            csvWriter.append(Long.toString(sideChannelEnd));                        
            csvWriter.append("\n");
            
            csvWriter.flush();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Switch.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
        

        
}
