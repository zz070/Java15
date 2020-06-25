package Test21;

import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            char[] c = sc.nextLine().toCharArray();
            char[] cc = new char[c.length];
            for(int i = 0;i< c.length;i++){
                if(cc[i]>'A'&&cc[i]<'Z'){
                    cc[i] = (char) (c[i]>'E'?(c[i]-5):(c[i]+21));
                }
            }
            System.out.println(cc.toString());
        }
    }
}
