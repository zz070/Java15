package MySort;

import java.util.Arrays;

public class InsertTest {
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 7, 3, 6, 1};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insert(int[] a) {
        for(int bound = 1;bound <a.length;bound++){
            int val = a[bound];
            int cur = bound - 1;
            for(;cur>=0;cur--){
                if(a[cur]>val){
                    a[cur+1] = a[cur];
                }else{
                    break;
                }
            }
            a[cur+1] = val;
        }
    }
}
