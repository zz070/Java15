package day1;

public class ArraySortTest {
    /*
    题目描述：
        输入一个整数数组，实现一个函数来调整该数组中数字的顺序
        使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
    思路：
         （1）
         （2）
     */
    public static void reOrderArray(int[] a){
        for(int i = 0;i<a.length;i++){
            int left = 0;
            int right = a.length-1;
            if((a[left]&1)==1){
                left++;
            }
            if((a[right]&1)==0){
                right--;
            }
            int t =  a[left];
            a[left] = a[right];
            a[right] = t;
        }
    }
}
