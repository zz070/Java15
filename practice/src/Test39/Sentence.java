package Test39;

import java.util.Scanner;
public class Sentence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        String news = "";
        for(int i = ss.length-1;i>=0;i--){
            if(i!=0){
                news+=ss[i]+" ";
            }else{
                news+=ss[i];
            }
        }
        System.out.println(news);
    }
}