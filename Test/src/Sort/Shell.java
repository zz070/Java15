package Sort;

import java.util.Arrays;

public class Shell {
    //希尔排序
    //将要排序的元素分成若干组，不断减少组数，进行插入排序，直至组数为1
    public static void shellSort(int[] array){
        int gap = array.length/2;
        while(gap>1){
            insetSortGap(array,gap);
            gap/=2;
        }
        insetSortGap(array,1);
    }

    //升序排序
    private static void insetSortGap(int[] array, int gap) {
        /*和插入排序类似
        [0,bound)保存的是已排序的区间
        [bound,array.length)保存的是未排序区间
        由于，将整个数组分组，每组元素个数为array.length/gap个，所以从gap开始，每次增加gap个元素，就恰好排序每一组元素
        若gap=1，则就是插入排序
         */
        for(int bound = gap;bound<array.length;bound+=gap){
            int val = array[bound];
            int cur = bound - gap;
            for(;cur>=0;cur-=gap){
                if(array[cur] > val){
                    array[cur+gap] = array[cur];
                }else{
                    break;
                }
            }
            array[cur+gap] = val;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 7, 3, 6, 1};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
