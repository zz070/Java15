package MyString;

public class SplitTest {
    public static void main(String[] args) {
        String s ="hello world ! Bye !";
        String[] ss = s.split(" ");
        for(String x:ss){
            System.out.print(x+"   ");
        }
        System.out.println();
        String[] ss2 = s.split(" ",1);
        for(String x:ss2){
            System.out.print(x+"   ");
        }
        System.out.println();
        String str = "192.168.1.1" ;
        String[] result = str.split("\\.") ;
        for(String sx: result) {
            System.out.print(sx+"  ");
        }
    }
}
