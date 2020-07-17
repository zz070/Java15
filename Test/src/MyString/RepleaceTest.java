package MyString;

public class RepleaceTest {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(s.replaceAll("o","00"));//替换所有指定内容
        System.out.println(s.replaceFirst("l","ww"));//替换首个指定内容
    }
}
