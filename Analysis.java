package javaapplication7;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.RoundingMode;

public class Analysis {
    
    int targetPeriod = 0;
    
    void runAnalysis () throws FileNotFoundException, IOException {
        
        

        ArrayList<Integer> sideChannelHitInterval = new ArrayList<Integer>();

        String row = "";

        String[] data = null;

        BufferedReader csvReader = new BufferedReader(new FileReader("/Users/mark/Desktop/version 6.4/csv node 34.csv"));

        row = csvReader.readLine();
        row = csvReader.readLine();       
     
        int previous = 0;
        
        row = csvReader.readLine();            

        data = row.split(",");
        
        previous = Integer.valueOf(data[6]);
        
        try {
            
                do {

                    row = csvReader.readLine();            

                    data = row.split(",");

                    if (Integer.valueOf(data[6]) != 0) {

                        int step = Integer.valueOf(data[6]) - previous;

                        previous = Integer.valueOf(data[6]);

                        sideChannelHitInterval.add(step); 

                    }
                }

                while (row != null) ;
            }
        
        catch(Exception e) {
  
        }


        
            int max = Collections.max(sideChannelHitInterval);
            
            int subrangeSize = 15; // clock cycles
            
            int numberOfDivisions = max / subrangeSize;
            
            ArrayList<Integer>[] intervals = new ArrayList[numberOfDivisions];

            // initializing
            for (int i = 0; i < numberOfDivisions; i++) {
                intervals[i] = new ArrayList<Integer>();
        }
            
            
            // histogram analysis      
            
            int [] bins = new int [numberOfDivisions]; int datapoint = 0;
            
            for (int j=0; j<sideChannelHitInterval.size(); j++) {
                
               datapoint = sideChannelHitInterval.get(j); 
               
                        for ( int i=0; i< numberOfDivisions; i++)
                        {
                            int minRange = subrangeSize*i; 

                            int maxRange = subrangeSize*(i+1)-1; 

                            if (datapoint >= minRange && datapoint <= maxRange)
                            {

                                bins[i]++;
                                
                                intervals[i].add(datapoint);

                            }

                        }              
                               
            }
            
            int maxBin=0; int binNo=0;
            
            for (int i=0; i<numberOfDivisions; i++) {
                
                if (bins[i] > maxBin ) {
                    
                    maxBin = bins[i];
                    
                    binNo = i;
                }
                
            }

            System.out.println("contents = " + intervals[binNo]);           
            
            int total = 0;

                    for(int i=0; i<intervals[binNo].size(); i++){
                        
                    total = total + intervals[binNo].get(i);
            }

            double average = total / intervals[binNo].size();

            System.out.format("target candidate period is: %.2f", average);

            System.out.println("");
            
            // =SUM(B2-A2)/(A2/100)
            
            double tp = (double) targetPeriod;
            
            double inaccuracyPrecision = (average-tp) / tp *100;
            
            BigDecimal bd = new BigDecimal(inaccuracyPrecision).setScale(2, RoundingMode.HALF_UP);

            double newInput = bd.doubleValue();

            System.out.println("error % : " + Math.abs(newInput));
            
        
            csvReader.close();
            
            System.exit(0);
    }
    

}
        



