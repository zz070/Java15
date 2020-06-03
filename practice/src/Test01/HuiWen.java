package Test01;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String A = sc.nextLine();
            String B = sc.nextLine();
            int count = 0;
            //插入的位置从0开始一直到字符串A的末尾即A.length()；
            for(int i =0;i<=A.length();i++){
                StringBuilder s = new StringBuilder(A);
                s.insert(i,B);
                if(isHuiWen(s.toString())){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean isHuiWen(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while(i<j){
            if(c[i] != c[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
