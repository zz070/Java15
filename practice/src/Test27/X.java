package Test27;

import java.util.*;
public class X{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            System.out.println(index(a,n,x));
        }
    }
    private static int index(int[] a,int n,int x){
        for(int i = 0;i < n;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
}
