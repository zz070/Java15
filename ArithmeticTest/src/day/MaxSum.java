package day;

public class MaxSum {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int max = array[0];
        for(int i = 1;i<array.length;i++){
            dp[i] = Math.max(dp[i-1]+array[i],array[i]);
            if(max<dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
    public int FindGreatestSumOfSubArray2(int[] array) {
        int total = array[0];
        int max = array[0];
        for(int i = 0;i<array.length;i++){
            if(total>=0){
                total+=array[i];
            }else{
                total = array[i];
            }
            if(max<total){
                max = total;
            }
        }
        return max;
    }
}
