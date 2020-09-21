package duxiaoman;

import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(isSimple(s));
        }
    }

    private static String isSimple(String s) {
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length-1;i++){
            if(c[i] == c[i+1]){
                return "YES";
            }
        }
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        int i =0;
        while(i<c.length&&i<c.length-3){
            if(c[i] == c[i+3]){
                count1++;
            }
            i+=3;
        }
        i =1;
        while(i<c.length&&i<c.length-3){
            if(c[i] == c[i+3]){
                count2++;
            }
            i+=3;
        }
        i =2;
        while(i<c.length&&i<c.length-3){
            if(c[i] == c[i+3]){
                count3++;
            }
            i+=3;
        }
        if((count1==count2)&&(count1>=2)&&(count2>=2)){
            return "YES";
        }
        if((count2 == count3)&&(count3>=2)&&(count2>=2)){
            return "YES";
        }
        if((count1 == count3)&&(count1>=2)&&(count3>=2)) {
            return "YES";
        }
        return "NO";
    }
}
