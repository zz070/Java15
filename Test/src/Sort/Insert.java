package Sort;

import java.util.Arrays;

public class Insert {
    //升序排列
    public static void insertSort(int[] array){
        //通过bound来划分是否已排序
        //其中[0,boung)表示已划分区域
        // [bound,array.length)表示未划分区域
        for(int bound = 1;bound < array.length;bound ++){
            int val = array[bound];
            int cur = bound -1;
            for(;cur>=0;cur--){
                if(array[cur] > val){                //这个条件如果写成 >= , 插入排序就不是稳定排序了
                    array[cur+1] = array[cur];
                }else{
                    break;
                }
            }
            array[cur+1] = val;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 7, 3, 6, 1};
         insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
