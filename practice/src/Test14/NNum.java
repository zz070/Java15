package Test14;

import java.util.Scanner;

//验证尼科彻斯定理
public class NNum {
    public static String getSequenceOddNum(int m){
        int[] num = new int[m];
        num[0] = m*(m-1)+1;
        if(m == 0){
            return String.valueOf(num[0]);
        }else {
            for (int i = 1; i < m; i++) {
                num[i] = num[i - 1] + 2;
            }
        }
            StringBuffer s = new StringBuffer();
            s.append(num[0]);
            for (int i = 1; i < m; i++) {
                s.append("+");
                s.append(num[i]);
            }
            return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            System.out.println(getSequenceOddNum(m));
        }
    }
}
