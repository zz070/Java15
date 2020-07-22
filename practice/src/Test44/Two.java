package Test44;

import java.util.HashMap;
import java.util.Map;

public class Two {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:array){
            Integer v = map.get(x);
            if(v == null){
                map.put(x,1);
            }else{
                map.put(x,v+1);
            }
            if(map.get(x)>array.length/2){
                return x;
            }
        }
        return 0;
    }
}
