package Test18;

import java.util.*;
public class Change{
    public static void main(String[] args){
        int s = 0;
        int r = 0;
        for(int i = 0;i<30;i++){
            s+=10;
            r+=(int)Math.pow(2,i);
        }
        System.out.println(s+" "+r);
    }
}