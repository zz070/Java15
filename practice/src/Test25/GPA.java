package Test25;

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        double allScore=0;
        double allPoint=0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            allScore+=a[i];
        }
        for(int i = 0;i<n;i++){
            b[i] = sc.nextInt();
            allPoint+=getPoint(b[i])*a[i];
        }
        double GPA = allPoint/allScore;
        System.out.printf("%.2f",GPA);
    }

    private static double getPoint(int grade) {
        if(grade>=90&&grade<=100) {
            return 4.0;
        } else  if(grade>=85&&grade<=89) {
            return 3.7;
        }else  if(grade>=82&&grade<=84) {
            return 3.3;
        } else  if(grade>=78&&grade<=81) {
            return 3.0;
        } else  if(grade>=75&&grade<=77) {
            return 2.7;
        } else  if(grade>=72&&grade<=74) {
            return 2.3;
        } else  if(grade>=68&&grade<=71) {
            return 2.0;
        } else  if(grade>=64&&grade<=67) {
            return 1.5;
        } else  if(grade>=60&&grade<=63) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
