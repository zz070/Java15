package Test28;

import java.util.*;
public class Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            judge(n);
        }
    }
    private static void judge(int n){
        String ns = String.valueOf(n);
        int nn = n*n;
        String nns = String.valueOf(nn);
        if(ns.equals(nns.substring(nns.length()-ns.length(),nns.length()))){
            System.out.println("YES!");
        }else{
            System.out.println("NO!");
        }
    }
}