package MyString;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        /*
        在String类中compareTo()方法是一个非常重要的方法，可以区分大小关系（字符串的比较大小规则, 总结成三个字 "字典序"）
        该方法返回一个整型，该数据会根据大小关系返回三类内容:
                (1)相等：返回0
                (2)大于：返回值大于0
                (3)小于：返回值小于0
         */
        System.out.println("A".compareTo("a")); // -32
        System.out.println("a".compareTo("A")); // 32
        System.out.println("A".compareTo("A")); // 0
    }
}
