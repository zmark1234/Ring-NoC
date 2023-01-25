
package javaapplication7;

import java.util.BitSet;

public class Link {
   
    Boolean transmitSignal = false;
    Boolean readySignal = true;
    
    Flit aFlit = new Flit();
        
    void drive(Flit theFlit) {
        
        aFlit = theFlit;
        transmitSignal = true;             
    }
    
    Flit sample() {
        
        transmitSignal = false;
        return aFlit;       
    } 
}

