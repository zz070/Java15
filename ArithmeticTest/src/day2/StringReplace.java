package day2;

public class StringReplace {
    public String replaceSpace(StringBuffer str) {
        StringBuffer ss = new StringBuffer();
        String s = str.toString();
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            if(c[i] == ' '){
                ss.append("%20");
            }else{
                ss.append(c[i]);
            }
        }
        return ss.toString();
    }
}
