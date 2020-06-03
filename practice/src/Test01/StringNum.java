package Test01;

import java.util.*;
public class StringNum {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            int count = 0;
            for(int i =0 ;i <c.length;i++){
                while((c[i]>=0||c[i]<=9)&&(c[i+1]>=0||c[i+1]<=9)){
                    count++;
                }
            }
        }
    }
}
