
package javaapplication7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Buffer {
    
    int capacity;
    
    LinkedBlockingQueue<Flit> queueA; // FIFO queue
    
    Buffer( int theCapacity) {
        
        capacity = theCapacity;
        queueA = new LinkedBlockingQueue<>(capacity);
    }
    
    Flit read() {       
        return queueA.remove();
    }
    
    void write(Flit inputFlit) {        
        queueA.add(inputFlit);
    }
    
    int numberOfElements() {       
        return queueA.size(); 
    }


}
