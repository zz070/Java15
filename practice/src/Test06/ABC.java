package Test06;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int y3 = sc.nextInt();
            int y4 = sc.nextInt();
            float A,B,C;
            A = (y1 + y3)/2f;
            B = (y2 + y4)/2f;
            C = (y4 - y2)/2f;
            if((A!=(y1 + y3)/2)||(B !=(y3-y1)/2)||(B != (y2 + y4)/2)||(C != (y4 - y2)/2)){
                System.out.println("No");
                return;
            }
            System.out.println((int)A+" "+(int)B+"  "+(int)C);
        }
    }
}
