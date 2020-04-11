package Sort;

import java.util.Arrays;

import static MyHeap.Heap.shiftDown;

public class Heap {
    //堆排序
    public static void heapSort(int[] array){
        createHeap(array);
        for(int i = 0;i< array.length-1;i++){
            int heapSize = array.length-i;
            swap(array,0,heapSize -1);
            heapSize--;
            shiftDown(array,heapSize,0);
        }
    }

    private static void swap(int[] array, int i, int heapSize) {
        int temp = array[i];
        array[i] = array[heapSize];
        array[heapSize] = temp;
    }

    private static void createHeap(int[] array) {
        for(int i=(array.length-1-1)/2;i>=0;i--){
            shiftDown(array,array.length,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 7, 3, 6, 1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
