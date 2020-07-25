package Test39;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String d = sc.nextLine();
            ArrayList<java.lang.Character> list = new ArrayList<>();
            for(int i = 0;i<s.length();i++){
                if(!(d.contains(s.charAt(i)+""))){
                    list.add(s.charAt(i));
                }
            }
            for(int i = 0;i<list.size();i++){
                System.out.println(list.get(i)+"");
            }
        }
}
