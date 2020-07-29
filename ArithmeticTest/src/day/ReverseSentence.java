package day;

public class ReverseSentence {
    public String reverseSentence(String s) {
        String[] ss = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = ss.length-1;i>=0;i--){
            if(i == 0){
                sb.append(ss[i]);
            }else{
                sb.append(ss[i]+" ");
            }
        }
        return sb.toString();
    }
    public String reverseSentence2(String s) {
        if(s == null||s.length() ==0){
            return s;
        }
        char[] c = s.toCharArray();
        int len = c.length;
        int i = 0;
        int j = 0;
        while(i<len){
            while(i<len&&c[i]!=' '){
                i++;
            }
            reverse(c,j,i-1);
            while(i<len&&c[i]==' '){
                i++;
            }
            j = i;
        }
        reverse(c,j,len-1);
        reverse(c,0,len-1);
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
}
