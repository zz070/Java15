package Test10;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(num(n));
        }
    }

    private static int num(int n) {
        int f1 = 0;
        int f2 = 1;
        if(n == f2 || n== f1){
            return 0;
        }
        while(true){
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
            if(n>f1&&n<=f2){
                return n-f1<f2-n?n-f1:f2-n;
            }
        }
    }
}
