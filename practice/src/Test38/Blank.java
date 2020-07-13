package Test38;

public class Blank {
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuffer s = new StringBuffer();
        char[] c = iniString.toCharArray();
        for (int i = 0; i < length; i++) {
            if (c[i] != ' ') {
                s.append(c[i]);
            } else {
                s.append("%20");
            }
        }
        return s.toString();
    }
}
