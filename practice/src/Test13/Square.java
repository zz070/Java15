package Test13;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        print(n,s);
    }
    private static void print(int n, String s){
        for(int i = 0;i<n;i++){
            System.out.print(s);
        }
        for(int i = 0;i<n/2;i++){
            System.out.print(s);
            for(int j = 0;j<n-2;j++){
                System.out.print(" ");
            }
            System.out.println(s);
        }
        for(int i = 0;i<n;i++){
            System.out.print(s);
        }
    }
}
