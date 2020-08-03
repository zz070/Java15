package MySort;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        int[] arr = {8, 2,5, 9, 7, 3, 6, 1};
        shell(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shell(int[] a) {
        int team = a.length/2;
        while(team>1){
            helper(a,team);
            team/=2;
        }
        helper(a,1);
    }

    private static void helper(int[] a, int team) {
        for(int bound = team;bound<a.length;bound+=team){
            int val = a[bound];
            int cur = bound-team;
            for(;cur>=0;cur-=team){
                if(a[cur] > val){
                    a[cur+team] = a[cur];
                }else {
                    break;
                }
            }
            a[cur+team] = val;
        }
    }
}
