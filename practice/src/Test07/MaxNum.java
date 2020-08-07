package Test07;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(minNum(a,b));
        }
    }

    private static int minNum(int a, int b) {
        int x = a>b?b:a;
        for(int i =  x;i<=a*b;i++){
            if(i%a==0&&i%b==0){
                return i;
            }
        }
        return 0;
    }
}
