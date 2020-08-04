package MySort;

import java.util.Arrays;

public class QuickTest {
    public static void main(String[] args) {
        int[] array = {1, 8, 6, 3, 0, 9, 2, 4, 7, 5};
        System.out.print("排序前：");
        System.out.print(Arrays.toString(array));
        System.out.println();
        quick(array);
        System.out.print("排序后：");
        System.out.print(Arrays.toString(array));
    }

    private static void quick(int[] array) {
        helper(array,0,array.length-1);
    }

    private static void helper(int[] array, int left, int right) {
        if(left>=right){
            return;
        }
        int index = patition(array,left,right);
        helper(array,0,index-1);
        helper(array,index+1,right);
    }

    private static int patition(int[] array, int left, int right) {
        int base = array[left];
        int begin = left;
        int end = right;
        while(begin<end){
            while(begin<end&&array[end]>=base){
                end--;
            }
            while(begin<end&&array[begin]<=base){
                begin++;
            }
            swap(array,begin,end);
        }
        swap(array,left,begin);
        return begin;
    }

    private static void swap(int[] array, int begin, int end) {
        int t = array[begin];
        array[begin] = array[end];
        array[end] = t;
    }
}
