package javaapplication7;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;

public class Taskset {
    
    int numTaskflows;
    
    int targetPeriod = 0;
    
    Taskflow [] taskFlows;
    
    int data[];
    
    Taskset() {

    }
    
    void loadCaseStudy() {  

        
        int data[] = loadRandomSubset();
        
        numTaskflows = data.length/6;
        
        System.out.println("number of task flows = " + numTaskflows);
        
        taskFlows = new Taskflow[numTaskflows];
        
        int j=0;
        
        for(int i=0; i<numTaskflows; i++) {
            
            taskFlows[i] = new Taskflow();
             
                taskFlows[i].sourceTask = data[j];
                taskFlows[i].destinationTask = data[j+1];
                taskFlows[i].computationTime = data[j+2];
                taskFlows[i].period = data[j+3]; 
                taskFlows[i].priority = data[j+4];
                taskFlows[i].numBytes = data[j+5];
                taskFlows[i].deadline = taskFlows[i].period;
                
                taskFlows[i].message = new Task(
                
                    taskFlows[i].sourceTask,
                    taskFlows[i].destinationTask,
                    taskFlows[i].computationTime,
                    taskFlows[i].period,
                    taskFlows[i].priority,
                    taskFlows[i].numBytes,
                    taskFlows[i].deadline);

                j = j + 6;
                
        }
        
    }
    
    int[] loadRandomSubset() {
        
        Random rand = new Random();
        
        int maxTasks = 17; int minTasks = 15;
        
        int numTasks = rand.nextInt((maxTasks - minTasks) + 1) + minTasks;
        
        numTasks = 27;
        
        int theData[] = new int[numTasks*6+18];
        
        ArrayList<Integer> sourceNodes = new ArrayList<Integer>();
        
        sourceNodes.add(16);
        
        sourceNodes.add(32);
        
        sourceNodes.add(33);
        
        sourceNodes.add(34);
        
        for (int i = 0; i<(numTasks*6); i=i+6) {       

        // nextInt as provided by Random is exclusive of the top value so you need to add 1 

        int max = 31; int min = 1;
        
        int sourceNode;
        
        do {
            sourceNode = rand.nextInt((max - min) + 1) + min;           
            
        }
            
        while (sourceNodes.contains(sourceNode));
        
        sourceNodes.add(sourceNode);
        

        // destination node
        
        int destinationNode;
        
        do {
            
             destinationNode = rand.nextInt((max - min) + 1) + min;
        }
        
        while (destinationNode == sourceNode || destinationNode==33) ;
        
        
        // computation
        
        int maxComputation = 1000; int minComputation = 100;
        
        int computation = rand.nextInt((maxComputation - minComputation) + 1) + minComputation;
        
        computation = 100;
        
        // period
        
        int maxPeriod = 1000; int minPeriod = 125;
        
        int period = rand.nextInt((maxPeriod - minPeriod) + 1) + minPeriod;
        
        period = 500;
        
        // messageSize
        
        int maxBytes = 1000; int minBytes = 100;
        
        int bytes = rand.nextInt((maxBytes - minBytes) + 1) + min;

        bytes = 100;
        
        theData[i]= sourceNode;
        
        theData[i+1]= destinationNode;
        
        theData[i+2]= 0;
        
        theData[i+3]= period;
        
        theData[i+4]= 31;
        
        theData[i+5]= bytes;
        
        }

        int extraIndex = numTasks*6;
        
        theData[extraIndex] = 32;
        theData[extraIndex+1] = 34; 
        theData[extraIndex+2] = 0;
        theData[extraIndex+3] = 13;
        theData[extraIndex+4] = 0;
        theData[extraIndex+5] = 10;
                
        theData[extraIndex+6] = 34;
        theData[extraIndex+7] = 35; 
        theData[extraIndex+8] = 0;
        theData[extraIndex+9] = 13;
        theData[extraIndex+10] = 0;
        theData[extraIndex+11] = 10;     
      
        int targetMaxPeriod = 999; int targetMinPeriod = 125;
        
        targetPeriod = rand.nextInt((targetMaxPeriod - targetMinPeriod) + 1) + targetMinPeriod;
        
        System.out.println("target period = " + targetPeriod);
 
        theData[extraIndex+12] = 16;   // target node  is 33
        theData[extraIndex+13] = 33; 
        theData[extraIndex+14] = 0;    // computation time
        theData[extraIndex+15] = targetPeriod;       
        theData[extraIndex+16] = 0;
        theData[extraIndex+17] = 300;  // number of bytes
      
        return theData;
           
    }

    int[] loadAVdataset() {
        
        
                //  source, destination, computation, period, priority, bytes        
          
                int theData[] = {     1,  2,  5,  500,    31, 2048,
                2,  3,  10, 500,    32, 2096,
                3,  42, 150,500,    33, 32768, 
                4, 6, 0, 20, 51, 10, // probe           
                5,  40, 20, 100,    24, 1024, // target node             
                6, 4, 0, 20, 51, 10, // probe            
                7,  40, 10, 100,    26, 2048,
                8,  47, 10, 40,     1,  76800,
                9,  48, 10, 40,     2,  76800,
                10, 42, 20, 500,    3,  1024,
                11, 42, 20, 500,    4,  1024,
                12, 20, 10, 40,     5,  76800,
                13, 21, 10	, 40,	6,       76800,
                14, 22, 10,      40,     7,       76800,
                15, 23, 10	, 40,   8,       76800,
                16, 24, 10	, 40,	9,	76800,
                17, 25,	10,	40,	10,	76800,
                18, 26,	10	,40,	11,	76800,
                19, 27,	10	,40,	12,	76800,
                20, 28,	20	,40,	13,	4096,
                21, 43,	20	,40,	14,	4096,
                22, 43,	20	,40,	15,	4096,
                23, 43,	20	,40	,16,	4096,
                24, 29,	20	,40	,17,	4096,
                25, 44,	20	,40	,18,	4096,
                26, 44,	20	,40	,19,	4096,
                27, 44,	20	,40	,20	,4096,
                28, 30,	10	,40,	21,	16384,
                29, 51,	10	,40	,22,	16384,
                30, 43,	30	,40	,23,	8192,
                31, 43,	5,	500,	35,	2048,
                32, 43,	5,	100,	27,	2048,
                33, 41,  20,     1000,	37,	8192,
                34, 36,   5,	500,	36,	4096,
                35, 38,  5,	100,	28,	1024, 
                36, 46,  10,     1000	,38,    4096,
                37, 45,   5,     100,	29,	2048,
                38, 44,  10,     100,    30,	2048,
                39, 41,  1,      1000,   39,     4096, // 1 should be 0.5
                
                50, 33,  150,    1000,   34,    65536, // this was task 4 .. not sent to by any task
                
                51, 5,    5,     1,    25,    1024 // this was task 6 .. not sent to by any task, period should be 100, bytes should be 1024

        };
                
        return theData;   
        
    }
  
}
