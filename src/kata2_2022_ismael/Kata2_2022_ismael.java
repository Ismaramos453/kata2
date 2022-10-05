package kata2_2022_ismael;

import java.util.HashMap;
import java.util.Map;

public class Kata2_2022_ismael {
    
    public static void main(String[] args) {
        //int [] dato = {1,6,2,8,3,8,2,7,3,4,2,9,0,6,0};
        //Integer [] dato = {1,6,2,8,3,8,2,7,3,4,2,9,0,6,0};
        String[] dato = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        HistogramGenerator histo = new HistogramGenerator(dato);

        Map<String, Integer> histogr = histo.getHistogram();
        for(Map.Entry<String, Integer> entry: histogr.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }  
}
