package Test18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int[] a = new int[n];
        while(sc.hasNext()){
            a[i] = sc.nextInt();
            i++;
        }
        sortArray(a);
    }

    private static void sortArray(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : a){
           int v =  map.get(x);
           if(v == 0){
               map.put(x,1);
           }else{
               map.put(x,v+1);
           }
        }
        int[] aa = new int[2];
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int kk = entry.getValue()%2;
            if(entry.getValue().equals(kk)){
                aa[i] = entry.getKey();
                i++;
            }
        }
        if(aa[0]>aa[1]){
            System.out.println(aa[1]+" "+aa[0]);
        }else{
            System.out.println(aa[0]+" "+aa[1]);
        }
    }
}
