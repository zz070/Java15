package MySort;

import java.util.Arrays;

public class HeapTest {
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 7, 3, 6, 1};
        heap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heap(int[] a) {
        createHeap(a);
        for(int i = 0;i<a.length;i++){
            int temp = a[0];
            a[0] = a[a.length-i-1];
            a[a.length-i-1] = temp;
            shiftDownBig(a,a.length-i-1,0);
        }
    }

    private static void createHeap(int[] a) {
        for(int i = (a.length-1-1)/2;i >= 0;i--){
            shiftDownBig(a,a.length,i);
        }
    }

    private static void shiftDownBig(int[] a, int size, int index) {
        int parent = index;
        int child = parent*2+1;
        while(child<size){
            if(child+1<size && a[child+1]>a[child]){
                child++;
            }
            if(a[child]>a[parent]){
                int temp = a[child];
                a[child] = a[parent];
                a[parent] = temp;
            }
            parent = child;
            child = parent*2+1;
        }
    }
}
