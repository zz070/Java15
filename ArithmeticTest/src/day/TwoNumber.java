package day;

public class TwoNumber {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || num1 == null || num2 == null){
            return;
        }
        num1[0] = 0;
        num2[0] = 0;
        int result = 0;
        for(int i = 0;i<array.length;i++){
            result ^= array[i];
        }
        int flag = 0;
        for(int i = 0;i<32;i++){
            if(((1<<i)&result) != 0){
                flag = i;
            }
        }
        for(int i = 0;i<array.length;i++){
            if((array[i]&(1<<i)) == 0){
                num1[0]^=array[i];
            }else{
                num2[0]^=array[i];
            }
        }
    }
}
