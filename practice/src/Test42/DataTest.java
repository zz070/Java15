package Test42;

import java.util.*;
public class DataTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            System.out.println(outData(year,month,day));
        }
    }
    private static int outData(int year,int month,int day){
        if(year<=0){
            return -1;
        }
        if(month<=0||month>12){
            return -1;
        }
        if(year%4==0&&year%100!=0||year%400==0){
            if(month==2){
                if(day<=0||day>29){
                    return -1;
                }else{
                    return day+31;
                }
            }
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                if(day<=0||day>31){
                    return -1;
                }
                if(month == 1){
                    return day;
                }
                if(month == 3){
                    return day+29+31;
                }
                if(month == 5){
                    return day+31+29+31+30;
                }
                if(month == 7){
                    return day+31+29+31+30+31+30;
                }
                if(month == 8){
                    return day+31+29+31+30+31+30+31;
                }
                if(month == 10){
                    return day+31+29+31+30+31+30+31+31+30;
                }
                if(month == 12){
                    return day+31+29+31+30+31+30+31+31+30+31+30;
                }
            }
            if(month==4||month==6||month==9||month==11){
                if(day<=0||day>30){
                    return -1;
                }
                if(month == 4){
                    return day+31+29+31;
                }
                if(month == 6){
                    return day+31+29+31+30+31;
                }
                if(month == 9){
                    return day+31+29+31+30+31+30+31+31;
                }
                if(month == 11){
                    return day+31+29+31+30+31+30+31+31+30+31;
                }
            }
        }else{
            if(month==2){
                if(day<=0||day>28){
                    return -1;
                }else{
                    return day+31;
                }
            }
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                if(day<=0||day>31){
                    return -1;
                }
                if(month == 1){
                    return day;
                }
                if(month == 3){
                    return day+28+31;
                }
                if(month == 5){
                    return day+31+28+31+30;
                }
                if(month == 7){
                    return day+31+28+31+30+31+30;
                }
                if(month == 8){
                    return day+31+28+31+30+31+30+31;
                }
                if(month == 10){
                    return day+31+28+31+30+31+30+31+31+30;
                }
                if(month == 12){
                    return day+31+28+31+30+31+30+31+31+30+31+30;
                }
            }
            if(month==4||month==6||month==9||month==11){
                if(day<=0||day>30){
                    return -1;
                }
                if(month == 4){
                    return day+31+28+31;
                }
                if(month == 6){
                    return day+31+28+31+30+31;
                }
                if(month == 9){
                    return day+31+28+31+30+31+30+31+31;
                }
                if(month == 11){
                    return day+31+28+31+30+31+30+31+31+30+31;
                }
            }
        }
        return -1;
    }
}
