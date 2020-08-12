package Test05;

import java.util.Scanner;

public class Bag {
    /*
    输入描述：
            输入的第一行是正整数n (1 <= n <= 20)，表示不同的物品的数目。接下来的n行，每行有一个1到40之间的正整数，分别给出a1，a2……an的值。
    输出描述：
            输出不同的选择物品的方式的数目
      解题思路：
                采用递归思想：
                ①物品n个，物品体积逐一放入weight[]中
                ②递归函数count(int s,int n) : 其中s为剩余物品重量，n为剩余可选的物品个数
                则分以下两步递归求解：
                a.从后往前装，装上weight[n]后，若剩余物品仍然有解
                则count(s-weight[n],n-1);
                b.若装了weight[n]后，无解，则删除该包,尝试第n-1个
                count(s,n-1);
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println(count(40,n));
        }
    }

    private static int count(int i, int n) {
        return 0;
    }
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int count = kind(a,n,40,0);
            System.out.println(count);
        }
    }

    private static int kind(int[] a,int n,int v,int index) {
        if(v == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }else{
            return kind(a,n-1,v-a[index],index+1)+kind(a,n-1,v,index+1);
        }
    }
    */
}
