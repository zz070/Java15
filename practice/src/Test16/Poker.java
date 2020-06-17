package Test16;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int i = 0;
        while(sc.hasNext()){
            a[i] = sc.nextInt();
            i++;
        }
        pokerSort(a);
        System.out.println(a);
    }

    private static void pokerSort(int[] a) {
        int size = a.length/2;
        int[] b = new int[a.length/2];
        int[] c = new int[a.length/2];
        for(int i = 0;i<a.length/2;i++){
            b[i] = a[i];
        }
        for(int i = a.length/2;i<a.length;i++){
            int j = 0;
            c[j] = a[i];
            j++;
        }
        for(int i = 0;i<a.length;i++){
            if(i%2==0){
                a[i] = b[i];
            }else{
                a[i] = c[i];
            }
        }
    }
}
