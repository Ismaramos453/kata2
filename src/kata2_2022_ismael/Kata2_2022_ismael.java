package kata2_2022_ismael;

import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Kata2_2022_ismael {

    public static void main(String[] args) {
        Integer [] data= {4, 2, 6, 4, 9, 8, 0, 1, 2, 6, 3, 7, 8, 5};
        Map<Integer, Integer>histogram = new HashMap<Integer, Integer>();
       
        
       for (int i = 0; i < data.length; i++) { 
           histogram.put(data[i], histogram.containsKey(data[i])? histogram.get(data[i]) + 1 : 1);
       }
        for( Map.Entry<Integer, Integer> entry: histogram.entrySet()){
            System.out.println( entry.getKey() + "==>" + entry.getValue());
        }
        
    }
            
    
    
}
