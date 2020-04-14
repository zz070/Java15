package MyMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MapExample4 {

    //坏键盘打字

    /*
    题目描述：
            输入:
            输入在2行中分别给出应该输入的文字、以及实际被输入的文字。
            每段文字是不超过80个字符的串，
            由字母A-Z（包括大、小写）、数字0-9、以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。

            输出:
            按照发现顺序，在一行中输出坏掉的键。
            其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。

   思路：
            1、循环读入字符串，第一个字符串是预期输出的内容; 第二个字符串是实际输出的内容
            2、方便起见，先将两个字符串转换为大写字母
            3、将实际输出的字符串存入一个Set中
            4、遍历预期输出的字符串，查看没有被实际输出的字符；
             （1）在此处，在创建一个set，用于保存已输出的字符
             （2）若实际输出的字符串中有，或该字符已经输出，就跳出本次循环
            （3）若实际输出的字符串中没有，且该字符串并为输出，就输出该字符，并将该字符加入保存已输出字符的set中
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //1、循环读入字符串
            String expected = sc.next();
            String actual = sc.next();
            //2、将两个字符串转换为大写字母
            expected = expected.toUpperCase();
            actual = actual.toUpperCase();
            //3、将实际输出的字符串存入一个Set中
            Set<Character> actualSet = new HashSet<>();
            for(int i=0;i<actual.length();i++){
                actualSet.add(actual.charAt(i)) ;
            }
            //4、（1）创建一个set，用于保存已输出的字符
            Set<Character> hasOutput = new HashSet<>();
            for(int i = 0;i < expected.length();i++){
                char c = expected.charAt(i);
                //4、（2）实际输出的字符串中有，跳出本次循环
                if(actualSet.contains(c)){
                    continue;
                }
                //4、（3）该字符已经输出，跳出本次循环
                if(hasOutput.contains(c)){
                    continue;
                }
                //4、（4）输出该字符，并将该字符加入保存已输出字符的set中
                System.out.print(c);
                hasOutput.add(c);
            }
        }
    }
}
