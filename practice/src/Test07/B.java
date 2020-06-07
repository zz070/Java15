package Test07;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = A > B ? A : B;
        for (int i = n; i <= A * B; i++) {
            if (i % A == 0 && i % B == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
