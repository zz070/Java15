package Test08;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class SmallKArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         while(sc.hasNext()){
             String s = sc.nextLine();
             String[] ss = s.split(" ");
             int[] array = new int[ss.length-1];
             for(int i = 0;i<ss.length-1;i++){
                 array[i] = Integer.valueOf(ss[i]);
             }
             int k = Integer.valueOf(ss[ss.length-1]);
             sort(array);
             for(int i = 0;i  <  k;i++){
                 if(i == k-1){
                     System.out.print(array[i]);
                 }else {
                     System.out.print(array[i]+" ");
                 }
             }
         }
    }
}
