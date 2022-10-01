package kata2_2022_ismael;

import java.util.HashMap;
import java.util.Map;

public class Kata2_2022_ismael {

    public static void main(String[] args) {
       int[] data = {1, 2, 1, 3, 3, 4, 5, 2, 1, 1, 1, 6, 7, 8, 8};

       Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        for (int key: data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }

       HistogramGenerator histogramGenerator = new HistogramGenerator(data);
       Map<Integer, Integer>histogram1 = histogramGenerator.getHistogram();

        for (Map.Entry<Integer, Integer> entry: histogram.entrySet()) {
            System.out.println(entry.getKey() + "====>" + entry.getValue());
        }
    }
            
    
    
}
