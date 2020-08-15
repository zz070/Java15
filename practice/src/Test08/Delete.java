package Test08;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if(n>1000){
                n = 999;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i < n;i++){
                list.add(i);
            }
            int i = 0;
            while(list.size()>1){
                i = (i+2)%list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
