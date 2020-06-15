package Test14;

import java.util.Scanner;

public class SmallNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =0;
        int[] a = new int[50];
        while(sc.hasNext()){
            a[i] = sc.nextInt();
            i++;
        }
        System.out.println(num(a));
    }

    private static String num(int[] a) {
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        StringBuffer s = new StringBuffer();
        int i = 0;
        while(a[i] == 0){
            i++;
        }
        s.append(a[i]);
        for(int j =0 ;j<i;j++){
            s.append(a[i]);
        }
        for(int j = i+1;j<a.length;j++){
            s.append(a[j]);
        }
        return s.toString();
    }
}
