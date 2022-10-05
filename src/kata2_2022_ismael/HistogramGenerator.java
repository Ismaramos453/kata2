package kata2_2022_ismael;

import java.util.HashMap;
import java.util.Map;



public class HistogramGenerator<T> {
    private final T[] dato;

    public HistogramGenerator(T[] data) {
        this.dato = data;
    }

    public T[] getData() {
        return dato;
    }

    public Map<T,Integer> getHistogram(){
        Map<T,Integer> map = new HashMap<>();
        for (int i = 0; i < dato.length; i++) {
            map.put(dato[i], map.containsKey(dato[i])? map.get(dato[i]) +1 : 1);
        }
        return map;
    }
}
   
