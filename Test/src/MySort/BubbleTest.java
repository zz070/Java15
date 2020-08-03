package MySort;

import java.util.Arrays;

public class BubbleTest {
    //冒泡排序
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 7, 3, 6, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    //升序排序
    private static void bubble(int[] a) {
        for(int i = 0;i < a.length-1;i++){
            for(int j = 0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }
}
