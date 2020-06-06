package Test06;

import java.util.*;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int i =0;
        while(sc.hasNext()){
            a[i] = sc.nextInt();
            i++;
        }
        System.out.println(num(a));
    }

    private static int num(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int count = map.getOrDefault(a[i], 0);
            map.put(a[i], count + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()>=a.length/2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
