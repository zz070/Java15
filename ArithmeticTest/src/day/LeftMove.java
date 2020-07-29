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
        return new String(c);
    }

    private void leftRotateHelper(char[] c) {
        char t = c[0];
        for(int i = 1;i<c.length;i++){
            c[i-1] = c[i];
        }
        c[c.length-1] = t;
    }
    //方法二；局部逆置，再整体逆置
    public String LeftRotateString2(String s,int n) {
        if(s.length() == 0||n == 0){
            return s;
        }
        int step = n%s.length();
        char[] c = s.toCharArray();
        reverse(c,0,step-1);
        reverse(c,step,c.length-1);
        reverse(c,0,c.length-1);
        return new String(c);
    }

    private void reverse(char[] c, int left, int right) {
        while(left<right){
            char t = c[left];
            c[left] = c[right];
            c[right] = t;
            left++;
            right--;
        }
    }

    //方法三：
    public static String LeftRotateString3(String s, int n) {
        if(s.length() == 0||n == 0){
            return s;
        }
        int step = n%s.length();
        char[] c = s.toCharArray();
        char[] cc = new char[c.length*2];
        for(int i = 0;i<c.length;i++){
            cc[i] = c[i];
            cc[i+c.length] = c[i];
        }
        return (new String(cc)).substring(step,s.length()+step);
    }
}
