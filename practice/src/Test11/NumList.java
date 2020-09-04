package Test11;
import java.util.*;
public class NumList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] c = num.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            list.add(0);
        }
        for(int i = 0;i<c.length;i++){
            list.set(c[i]-'0',list.get(c[i]-'0')+1);
        }
        for(int i = 0;i<list.size();i++){
            if(list.get(i)>0){
                System.out.println(i+":"+list.get(i));
            }
        }
    }
}
