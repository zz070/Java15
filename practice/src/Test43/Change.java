package Test43;

import java.util.*;
public class Change{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            for(int i = 0;i<c.length;i++){
                if(c[i] == '_'){
                    for(int j = i;j<c.length-1;j++){
                        c[j] =c[j+1];
                    }
                    c[i]=Character.toUpperCase(c[i]);
                }
            }
            System.out.println(c.toString());
        }
    }
}
