package Test09;

import java.util.Scanner;

public class NumOfZore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(numOfZore(n));
        }
    }

    private static int numOfZore(int n) {
        int result = 0;
        for(int i = n;i>=5;i--){
            int t = n;
            while(t%5==0){
                result++;
                t/=5;
            }
        }
        return result;
    }
}
