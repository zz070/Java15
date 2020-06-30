package Test26;

import java.util.*;
public class Num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            sum(n);
        }
    }
    private static void sum(int n){
        int m = n*n;
        int s1 = 0;
        int s2 = 0;
        while(n>0){
            s1+=n%10;
            n/=10;
        }
        while(m>0){
            s2+=m%10;
            m /=10 ;
        }
        System.out.println(s1+" "+s2);
    }
}