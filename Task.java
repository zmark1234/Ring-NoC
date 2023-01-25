
package javaapplication7;

import java.util.BitSet;

public class Task {
    
    // note implementation in java API of 'bitset' object is a minimum 64 bits
    // 32 bit message returns a value of 64 from size() method call
    
    int source_node;
    int dest_node;
    int computation;
    int period;
    int priority;
    int bytes;
    int deadline;
    
    int numberOfFlits;
    
    boolean isProbe = false;
    
    long timeSent = 0;
    
    long probeDelay = 0;
                    
    String [] flits;
    
    Task( int sourceNode, int destNode, int theComputation, int thePeriod, int thePriority, int noBytes, int theDeadline) {
        
        source_node = sourceNode;
        
        dest_node = destNode;
        
        computation = theComputation;
  
        period = thePeriod;
        
        priority = thePriority;
        
        bytes = noBytes;
        
        deadline = theDeadline;
        
        if (noBytes<8) noBytes = 8; // minimum flit size is 64 bits
                
        numberOfFlits = noBytes*8/64; // number of 64 bit flits 

        if ( (noBytes*8 % 64) >0 ) numberOfFlits++; // the remainder flit is added

        loadUp();
             
    }
    
    void loadUp () {

        int remainder = numberOfFlits % 10;    
        
        if (remainder == 2) {  // smallest packet is 3 flits i.e. header, body, and tail
            
            numberOfFlits++;
            
            remainder = 3;
        } 
                   
        if (remainder == 1) {
            
            numberOfFlits++; 
            numberOfFlits++;
            remainder = 3;
        } 
        
        flits = new String [numberOfFlits];
        
        int i=0;
        
        int loop = 0;
        
        if (numberOfFlits > 9) {
            
            loop = numberOfFlits-remainder;
        }
        
        
        while (loop>0 ) {
            
            flits [i] = "H";
            loop--;
      
            for (int j=1; j<9; j++) {
                
                i++;
                flits [i] = "B";
                loop--;
            }            
            
            i++;
            flits [i] = "T";
            loop--; 
            i++;
        }
        

        
        // loadup remainder            
        while (remainder>0) {
            
            flits[i]= "H";
            remainder--;
        
            while (remainder>1) {
                i++;
                flits [i] = "B";
                remainder--;
            }
        
            i++;
            flits[i]= "T";
            remainder--;
            
        }
         
    }
}


