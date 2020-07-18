package Test42;

import java.util.*;
public class Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(addPassword(s1));
            System.out.println(outPassword(s2));
        }
    }
    private static String addPassword(String s){
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            if(c[i]>='0'||c[i]<='9'){
                if(c[i]=='9'){
                    c[i] = '0';
                }else{
                    c[i]+='1';
                }
            }
            if(c[i]>'A'||c[i]<'Z'){
                if(c[i]=='Z'){
                    c[i]='a';
                }else{
                    c[i]+=33;
                }
            }
            if(c[i]>'a'||c[i]<'z'){
                if(c[i]=='z'){
                    c[i]='A';
                }else{
                    c[i]-=31;
                }
            }
        }
        return c.toString();
    }
    private static String outPassword(String s){
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            if(c[i]>='0'||c[i]<='9'){
                if(c[i]=='0'){
                    c[i] = '9';
                }else{
                    c[i]-='1';
                }
            }
            if(c[i]>'A'||c[i]<'Z'){
                if(c[i]=='A'){
                    c[i]='z';
                }else{
                    c[i]+=31;
                }
            }
            if(c[i]>'a'||c[i]<'z'){
                if(c[i]=='a'){
                    c[i]='Z';
                }else{
                    c[i]-=33;
                }
            }
        }
        return c.toString();
    }
}