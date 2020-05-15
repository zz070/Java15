package Sort;

import java.util.Arrays;

public class Quick {

    private static void quickSort(int[] array){
        quickHelper(array,0,array.length-1);
    }

    private static void quickHelper(int[] array, int left, int right) {
        if(left >= right){
            return;
        }
        int index = partition(array,left,right);
        quickHelper(array,left,index-1);
        quickHelper(array,index+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int begin = left;
        int end = right;
        int base = array[left];
        while(begin < end){
            while(begin < end && array[end] >= base){
                end--;
            }while(begin < end && array[begin] <= base ){
                begin++;
            }
            swap(array,begin,end);
        }
        swap(array,left,begin);
        return begin;
    }

    private static void swap(int[] array,int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 3, 0, 9, 2, 4, 7, 5};
        System.out.print("排序前：");
        System.out.print(Arrays.toString(array));
        System.out.println();
        quickSort(array);
        System.out.print("排序后：");
        System.out.print(Arrays.toString(array));
    }
}
