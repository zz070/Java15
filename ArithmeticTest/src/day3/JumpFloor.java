package day3;

public class JumpFloor {
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
    }
}
