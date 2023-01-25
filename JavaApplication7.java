
package javaapplication7;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication7 {

    public static void main(String[] args) throws IOException {
                
        RingNoC51 ring = new RingNoC51();
        
        try { 
            ring.initialise();
            
        } catch (InterruptedException ex) {
            
            Logger.getLogger(JavaApplication7.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
    
      

