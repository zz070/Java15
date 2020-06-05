package Test05;

import java.util.Scanner;

public class Bag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int count = kind(a,n,40,0);
            System.out.println(count);
        }
    }

    private static int kind(int[] a,int n,int v,int index) {
        if(v == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }else{
            return kind(a,n-1,v-a[index],index+1)+kind(a,n-1,v,index+1)
        }
    }
}
