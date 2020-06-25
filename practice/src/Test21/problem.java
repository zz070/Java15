package Test21;

import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            char[] c = sc.nextLine().toCharArray();
            for(int i = 0;i< c.length;i++){
                char s = c[i];
                if(c[i]>='A'&&c[i]<='Z'){
                    s = (char) (s>'E'?(s-5):(s+21));
                }
                c[i] = s;
            }
            System.out.println(new String(c));
        }
    }
}
