package day;

import java.util.Scanner;

public class HuiWen {
    /*
    输入描述:
            第一行包含T，测试数据的组数。后面跟有T行，每行包含一个字符串。
    输出描述:
            如果可以删去一个字母使它变成回文串，则输出任意一个满足条件的删去字母的位置（下标从0开始）。例如：

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            StringBuffer sb = new StringBuffer(sc.next());
            int[] start = new int[1];
            int[] end = new int[1];
            if(isHuiWen(sb,start,end)){
                System.out.println(-1);
            }else{
                sb.deleteCharAt(end[0]);
                if(isHuiWen(sb,null,null)){
                    System.out.println(end[0]);
                }else{
                    System.out.println(start[0]);
                }
            }
            n--;
        }
    }

    private static boolean isHuiWen(StringBuffer sb, int[] start, int[] end) {
        int i = 0;
        int j = sb.length()-1;
        boolean result = true;
        while(i<=j){
            if(sb.charAt(i)!=sb.charAt(j)){
                result = false;
                break;
            }
            i++;
            j--;
        }
        if(start!=null){
            start[0] = i;
        }
        if(end!=null){
            end[0] = j;
        }
        return result;
    }
}
