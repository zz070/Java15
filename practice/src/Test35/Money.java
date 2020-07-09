package Test35;

public class Money{
    public static void main(String[] args){
        int r = 1;
        int s = 0;
        int sum = 0;
        for(int i = 0;i<30;i++){
            sum+=r;
            r*=2;
            s+=10;
        }
        System.out.println(s+" "+sum);
    }
}
