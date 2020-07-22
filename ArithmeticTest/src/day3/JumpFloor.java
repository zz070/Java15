package day3;

public class JumpFloor {
    //简单的动态规划
    public static int jump1(int n){
        int[] step = new int[n+1];
        step[0] = 1;
        step[1] = 1;
        for(int i = 2;i<=n;i++){
            step[i] = step[i-1]+step[i-2];
        }
        return step[n];
    }
    //台阶问题，同样可以转化为斐波那契数列问题

    private static int jump(int n) {
        if(n == 0||n == 1){
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        int third = 1;
        while(n>2){
            third = first+second;
            first = second;
            second = third;
            n--;
        }
        return third;
    }
    public static void main(String[] args) {
        System.out.println(jump(10));
        System.out.println(jump1(10));

    }
}
