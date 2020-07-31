package day;

public class RectCover {
    public static int rectCover(int target) {
        if(target ==0 ||target==1){
            return 1;
        }
        int[] dp = new int[target+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<=target;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(rectCover(5));
    }
}
