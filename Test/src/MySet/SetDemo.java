package MySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //增加元素
        set.add("Hello");
        set.add("World !");
        //判断某个值是否存在
        System.out.println(set.contains("Hello"));
        //删除某个元素
        set.remove("Hello");
        System.out.println(set.contains("Hello"));
        //遍历所有元素
        set.add("Java");
        set.add("Hi!");
        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        //清空集合
        set.clear();
        System.out.println(set);
    }
}
