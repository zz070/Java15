package Sort;

import java.util.Arrays;

public class Bubble {
    //冒泡排序
    public static void bubbleSort(int[] array){
        for(int i =0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 7, 3, 6, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
