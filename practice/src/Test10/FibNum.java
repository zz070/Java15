package Test10;

public class FibNum {
    public static void main(String[] args) {
        System.out.println(fib3(0));
    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static int fib2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int one = 1;
        int two = 1;
        int three = 1;
        while(n > 2){
            three = one+two;
            one = two;
            two = three;
        }
        return three;
    }
    private static int fib3(int n){
        int[] fib = new int[n+1];
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2;i<=n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
}
