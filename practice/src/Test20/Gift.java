package Test20;

import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:gifts){
            int v = map.getOrDefault(x,0);
            if(v == 0){
                map.put(x,1);
            }else{
                map.put(x,v+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
