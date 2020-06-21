package Test19;

import java.util.*;

public class SubStr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        String[] ss = s.split("");
        boolean[] b = new boolean[n];
        Set<String> set = new HashSet<>();
        for(int i =0 ;i<n;i++){
           if( set.contains(p[i])){
               b[i] = true;
           }else{
               b[i] = false;
           }
        }
        return b;
    }
}