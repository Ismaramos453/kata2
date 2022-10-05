package kata2_2022_ismael;

import java.util.HashMap;
import java.util.Map;

public class Kata2_2022_ismael {
    
    public static void main(String[] args) {
        //int [] data = {1,6,2,8,3,8,2,7,3,4,2,9,0,6,0};
        Integer [] data = {1,6,2,8,3,8,2,7,3,4,2,9,0,6,0};
        
        HistogramGenerator histo = new HistogramGenerator(data);

        Map<Integer, Integer> histogr = histo.getHistogram();
        for(Map.Entry<Integer, Integer> entry: histogr.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }  
}
