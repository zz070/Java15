package day;

public class LeftMove {
    //方法一：一个一个的迁移过去
    public String LeftRotateString(String s,int n) {
        if(s.length() == 0 || n == 0){
            return s;
        }
        int step = n%s.length();
        char[] c = s.toCharArray();
        for(int i = 0;i<step;i++){
            leftRotateHelper(c);
        }
        return c.toString();
    }

    private void leftRotateHelper(char[] c) {
        char t = c[0];
        for(int i = 1;i<c.length;i++){
            c[i-1] = c[i];
        }
        c[c.length-1] = t;
    }
    //方法二；局部逆置，再整体逆置
}
