package day1;

public class ArrayTest {
    /*
    题目描述：二维数组的查找
            在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
            请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数

     思路：
            （1）该数组的特点：从左到右递增，从上到下递增；
            （2）判断一个数是否在该二维数组中，有两种方法：
                        ①遍历整个数组，一一查找；
                        ②利用该数组的特点，每次从最左上角的元素开始找，一次可以排除一行或一列；
            （3）方法二：
                        ①从最左上角的元素开始，该元素是本行最大的元素，本列最小的元素，一次可以排除一行或一列
                        ②在数组范围内找到返回true，否则返回false；
     */
    public boolean Find(int target, int [][] array){
        if(array == null){
            return false;
        }
        int i = 0;
        int j = array[0].length-1;
        while(i<array.length&&j>=0){
            if(target>array[i][j]){
                i++;
            }else if(target<array[i][j]){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }
}
