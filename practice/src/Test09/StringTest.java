package Test09;

import java.util.*;
public class StringTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String s = ""+n;
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.reverse());
        }
    }
}
