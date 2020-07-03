package Test29;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = in.nextInt();
        int[] value = new int[n];
        long[] dp = new long[sum+1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            value[i] = in.nextInt();
            for (int j = sum; j >= value[i] ; j--) {
                dp[j] += dp[j-value[i]];
            }
        }
        System.out.println(dp[sum]);
    }

}

