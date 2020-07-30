package day;

public class MinNum {
    //例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
    //NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    //方法一：遍历查找
    public int minNumberInRotateArray(int[] array) {
        if(array == null||array.length == 0){
            return 0;
        }
        for(int i = 0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return  array[0];
    }

    //方法二：二分查找
    public int minNumberInRotateArray2(int[] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        int mid = 0;
        while(array[left]>=array[right]){
            if(right-left==1){
                mid = right;
                break;
            }
            mid = left+(right-left)/2;
            if(array[left] == array[right]&&array[mid] == array[left]){
                int result = array[left];
                for(int i = left+1;i<right;i++){
                    if(array[i]<result){
                        result = array[i];
                    }
                }
                return result;
            }
            if(array[mid]>=array[left]){
                left = mid;
            }else {
                right = mid;
            }
        }
        return array[mid];
    }
}
