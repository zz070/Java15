package MySort;

import java.util.Arrays;

public class SelectTest {
    public static void main(String[] args) {
        int[] arr = {9, 5,4, 0, 7, 2,8,3, 6, 1};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void select(int[] a){
        for(int bound = 0;bound<a.length-1;bound++){
            for(int cur = bound+1;cur<a.length;cur++){
                if(a[cur]<a[bound]){
                    int t = a[bound];
                    a[bound] = a[cur];
                    a[cur] = t;
                }
            }
        }
    }
}
