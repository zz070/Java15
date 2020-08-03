package MyHeap;

import java.util.Arrays;

public class HeapTest {
    public static void shiftDownSmall(int[] array, int size, int index) {
        int parent = index;
        int child = parent * 2 + 1;
        while (child < size) {
            if(child+1<size&&array[child+1]<array[child]){
                child++;
            }
            if(array[child]<array[parent]){
                int t = array[parent];
                array[parent] = array[child];
                array[child] = t;
            }
            parent = child;
            child = parent*2+1;
        }
    }
    private static void createHeap(int[] a,int size){
        for(int i = (size-1-1)/2;i>=0;i--){
            shiftDownSmall(a,size,i);
        }
    }
    public static void main(String[] args) {
        int[] array = {9, 5, 2, 7, 3, 6, 8};
        System.out.print("建一个小堆：");
        createHeap(array, array.length);
        System.out.println(Arrays.toString(array));
//        System.out.print("建一个大堆：");
//        createHeapBig(array, array.length);
//        System.out.println(Arrays.toString(array));
    }
}
