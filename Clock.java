
package javaapplication7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clock {
    
    Gui theGui;
    long cycles = 0;   
    int targetPeriod = 0;
    
    ArrayList <SoCcomponent> theClockedComponents = new ArrayList <SoCcomponent> ();
    
    void register(SoCcomponent c) {
        
        theClockedComponents.add(c);
    }     
    
    void start() throws InterruptedException { 
       
       int size = theClockedComponents.size();
       
       boolean reply = false; boolean running = true;
     
       
       
       
       while (cycles<1000000) {
           
           if (running) {
               
//               TimeUnit.MILLISECONDS.sleep(10);
           }
           
           while (theGui.pauseButtonPushed) {
               TimeUnit.MILLISECONDS.sleep(100);
           }

       for (int i=0; i<size; i++) {
           
          theClockedComponents.get(i).risingEdge();                
       } 
  
       for (int i=0; i<size; i++) {
          theClockedComponents.get(i).fallingEdge();            
       }  
       
       cycles++;
       
       theGui.updateClockCyles(cycles);  
      }
          
       theGui.repaint();
       
       Analysis anal = new Analysis();
       
       anal.targetPeriod = this.targetPeriod;
        
        try {
            anal.runAnalysis();
        } catch (IOException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
     
    }

 
