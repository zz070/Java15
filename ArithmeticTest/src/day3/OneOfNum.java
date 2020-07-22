package day3;

public class OneOfNum {
    private static int oneNum(int n){
        int count = 0;
        while(n != 0){
            n &= (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(oneNum(5));
    }
}
