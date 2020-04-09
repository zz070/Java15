package Sort;

import java.util.Arrays;

public class Select {
    //选择排序
    //每一次从无序区间选出最大（或最小）的一个元素，存放在无序区间的最后（或最前），直到全部待排序的数据元素排完 。
    //升序排列
    public static void selectSort(int[] array){
        //以bound位置元素作为擂主，依次取未排序区域元素与之比较，打擂成功即交换位置
        for(int bound = 0;bound<array.length;bound++){
            for(int cur = bound + 1;cur<array.length;cur++){
                if(array[cur] < array[bound]){
                    int temp = array[cur];
                    array[cur] = array[bound];
                    array[bound] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 0, 7, 8,3, 6, 1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
