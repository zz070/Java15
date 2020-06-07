package Test07;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int count = 0;
        if(H%4 == 0|| W%4 == 0){
            count = W*H/2;
        }else{
            count = W*H/2+1;
        }
        System.out.println(count);
    }
}
