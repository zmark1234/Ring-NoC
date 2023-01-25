package javaapplication7;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskBuffer {
    
    int capacity;
    LinkedBlockingQueue<Task> queueA; // FIFO queue
    
    TaskBuffer( int theCapacity) {
        capacity = theCapacity;
        queueA = new LinkedBlockingQueue<>(capacity);
    }
    
    Task read() {       
        return queueA.remove();
    }
    
    void write(Task message) {        
        queueA.add(message);
    }
    
    int numberOfElements() {       
        return queueA.size(); 
    }


}
