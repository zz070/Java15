package Test04;

import java.util.Scanner;

public class Apple {
    /*
    输入描述：
         输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
    输出描述：
         输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
    思路：
            （1）由于6和8都是偶数，因此，若苹果总数n为奇数，直接返回-1；
            （2）若苹果总数为偶数个，由于题目要求，要尽量少的袋数，所以，用苹果总数n对8取模，其结果只可能为0,2,4,6，此时，在分情况讨论：
                           ①若n%8==0,那么直接返回n/8;
                           ②若n%8==2,那么需要回溯两次，即返回n/8-2+3=n/8+1(8+8+2=18, 18%6 = 0)
                           ③若n%8==4.那么需要回溯一次，即返回n/8-1+2=n/8+1(8+4=12, 12%6 = 0)
                           ④若n%8==4.那么不需要回溯，即返回n/8+1(6%6 = 0)
        总结可得，分为三种情况：
                ①n为奇数直接返回-1；
                ②n%8==0,直接返回n/8；
                ③n%8!=0，直接返回n/8+1;
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(num(n));
    }

    private static int num(int n) {
        if(n%2!=0){
            return -1;
        }else if(n%8==0){
            return n/8;
        }else{
            return n/8+1;
        }
    }
}
