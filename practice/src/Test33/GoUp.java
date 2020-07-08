package Test33;


public class GoUp {
    public int countWays(int n) {
        // write code here
        int[] a = new int[100000];
        a[1] = 1;
        a[2] = 2;
        a[3] = 4;
        for(int i = 4;i<=n;i++){
            a[i]= (a[i-1]+(a[i-2]+a[i-3])%1000000007)%1000000007;
        }
        return a[n];
    }
}