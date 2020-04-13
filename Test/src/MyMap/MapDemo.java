package MyMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //插入元素
        map.put("1","A");
        map.put("2","B");
        map.put("3","D");
        map.put("3","C");  //若重复插入就会覆盖之前插入的元素
        //根据key获得value
        System.out.println(map.get("1"));
        //若找不到，返回null
        System.out.println(map.get("8"));
        //判断是否包含key
        System.out.println(map.containsKey("2"));
        System.out.println(map.containsKey("20"));
        //判断是否包含Value
        System.out.println(map.containsValue("C"));
        System.out.println(map.containsValue("D"));
        //判断是否为空
        System.out.println(map.isEmpty());
        //打印所有的key
        for(String key : map.keySet()){
            System.out.print(key+"  ");
        }
        System.out.println();
        //打印所有的value
        for(String value : map.values()){
            System.out.print(value+" ");
        }
        System.out.println();
        //根据key - value映射关系打印
        //foreach
        for(Map.Entry<String,String> entry :map.entrySet()){
            System.out.print(entry.getKey()+" : "+entry.getValue()+"  ");
        }
        System.out.println();
        //Iterator迭代器
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.print(entry.getKey()+" : "+entry.getValue()+"  ");
        }
    }
}
