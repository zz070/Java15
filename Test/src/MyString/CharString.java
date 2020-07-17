package MyString;

public class CharString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.charAt(1));
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]+"  ");
        }
        System.out.println();
        // 字符数组转为字符串
        System.out.println(new String(c)); // 全部转换
        System.out.println(new String(c,0,4)); // 部分转换

        String ss = "110010110" ;
        // String 转 byte[]
        byte[] b = ss.getBytes() ;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        // byte[] 转 String
        System.out.println(new String(b));
        System.out.println(new String(b,1,5));
    }
}
