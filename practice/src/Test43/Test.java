package Test43;

import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            for(int i = ss.length-1;i>=0;i--){
                if(i==0){
                    System.out.println(ss[i]);
                }else{
                    System.out.print(ss[i]+" ");
                }
            }
        }
    }
}
