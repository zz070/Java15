package Test10;

import java.util.Scanner;

public class Step {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int fib1 = 0;
            int fib2 = 1;
            int fibn = 1;
            while (n>fibn){
                fibn = fib1+fib2;
                fib1 = fib2;
                fib2 = fibn;
            }
            int num1 = fib2-n;
            int num2 = n-fib1;
            System.out.println( num1>num2?num2:num1);
        }
    }
}
