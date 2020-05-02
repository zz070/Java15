package Practice;

public class TestString {

    public static void main(String[] args) {


        /*
    字符串比较
            1、区分大小写的比较
            2、不区分大小写的比较
            3、比较两个字符串的大小关系(compareTo)
                (1) 相等：返回0.
                (2) 小于：返回内容小于0.
                (3) 大于：返回内容大于0
     */
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("1".compareTo("2"));
    }
    /*

     */



}
