package duxiaoman;

import java.util.*;

public class Color {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        System.out.println(count(c1,c2));
    }

    private static int count(char[] c1, char[] c2) {
        int size = 0;
        Map<Character,Integer> map = new HashMap<>();
            for(char cc : c1){
                int val = map.get(cc);
                map.put(cc,val+1);
            }
        Set<Character> set = new HashSet<>();
        for(int i =0;i<c2.length;i++){
            if(set.contains(c2[i])){
                size++;
            }
        }
        return size;
    }
}
