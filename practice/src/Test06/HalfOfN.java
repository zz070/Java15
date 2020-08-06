package Test06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HalfOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            int[] a = new int[ss.length];
            for(int i = 0;i<a.length;i++){
                a[i] = Integer.valueOf(ss[i]);
            }
            System.out.println(half(a));
        }
    }

    private static int half(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<a.length;i++){
            int count = map.getOrDefault(a[i],0);
            map.put(a[i],count+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=a.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
