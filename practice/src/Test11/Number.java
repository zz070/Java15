package Test11;

import java.util.*;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            sortNum(n);
        }
    }

    private static void sortNum(int n) {
        String s = ""+n;
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char x:c){
            Integer value = map.getOrDefault(x,0);
            map.put(x,value+1);
        }
        Set<Character> set = new HashSet<>();
        for(char x:c){
            set.add(x);
        }
        ArrayList<Character> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList,(o1, o2)->{
            int count1 = map.get(o1);
            int count2 = map.get(o2);
            if(count1 == count2){
                return o1.compareTo(o2);
            }
            return count2-count1;
        });
        for(int i =0;i<set.size();i++){
            System.out.println(arrayList.get(i)+":"+map.get(arrayList.get(i)));
        }
    }
}
