package tasks.task029;

import java.util.HashMap;
import java.util.Map;

public class Task29 {
    public static <K> Map<K, Integer> arrayToMap(K[] ks){
        Map<K,Integer> map = new HashMap<>();
        for (int i=0; i<ks.length;i++){
            if(map.containsKey(ks[i])){
                map.put(ks[i], map.get(ks[i])+1);
            }else{
                map.put(ks[i], 1);
            }
        }
        return map;
    }
}
