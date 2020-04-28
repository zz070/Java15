package Practice;

import java.util.Scanner;

public class Fib {
    /*
    Fibonacci数列是这样定义的：
    F[0] = 0
    F[1] = 1
            for each i ≥ 2: F[i] = F[i-1] + F[i-2]
    因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。
    给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。

    输入描述:
    输入为一个正整数N(1 ≤ N ≤ 1,000,000)

    输出描述:
    输出一个最小的步数变为Fibonacci数

    思路：
            1、根据输入描述，无需考虑小于1的情况
            2、根据输入的n,判断与之相近的Fibonacci数
            3、找出变为Fibonacci数的最小步数
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        while (n > f2) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }//该循环结束时，f1<n<=f2
        //找出变为Fibonacci数的最小步数
        int ret = (f2 - n) > (n - f1) ? (n - f1) : (f2 - n);
        System.out.println(ret);
    }
}
