package Test08;

import java.util.Arrays;
import java.util.Scanner;


public class SmallArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int i = 0;
        while(sc.hasNext()){
            a[i] = sc.nextInt();
            i++;
        }
        int n = sc.nextInt();
        sort(a);
        for(int x =0;x<n;x++){
            System.out.print(a[x]+" ");
        }
    }

    private static void sort(int[] a) {
        for(int i = 0;i<a.length-1;i++){
            for(int j = 0 ;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t =a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }
}
