package Test04;

import java.util.Scanner;

public class DeleteCharacter {
    /*
    输入描述：
            每个测试输入包含2个字符串
    输出描述：
             输出删除后的字符串
    示例:
        输入
                  They are students.
                   aeiou
        输出
                 Thy r stdnts.
       思路：
                两层循环遍历，将“They are students.”称为字符串1，将“aeiou”称为字符串2。
                每遍历到字符串2中的一个字符，就在字符串1中找到相同的字符，找到之后删除它，并将字符串1后面的字符整体向前移动1位。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String d = sc.nextLine();
            char[] c = s.toCharArray();
            for(int i = 0;i<c.length;i++){
                if(!d.contains(c[i]+"")){
                    System.out.print(c[i]);
                }
            }
        }
    }
}
