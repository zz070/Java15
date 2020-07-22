package day3;

public class FibNum {
    //递归
    private static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    //循环迭代
    private static int fib2(int n){
        if( n == 0){
            return 0;
        }
        int first = 1;
        int second = 1;
        int third = 1;
        while(n>2){
            third = first+second;
            first = second;
            second = third;
            n--;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
        System.out.println(fib2(8));
    }
}
