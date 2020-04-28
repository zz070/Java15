package Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Num {
    /*
    牛牛想尝试一些新的料理，每个料理需要一些不同的材料，问完成所有的料理需要准备多少种不同的材料。

        输入描述:
        每个输入包含 1 个测试用例；
        每个测试用例的第 i 行，表示完成第 i 件料理需要哪些材料，各个材料用空格隔开，输入只包含大写英文字母和空格；
        输入文件不超过 50 行，每一行不超过 50 个字符。

        输出描述:
        输出一行一个数字表示完成所有料理需要多少种不同的材料。

        思路：
            1、用例是按行输入的，最后输出一行一个数字，确定输入框架
            2、利用Set去重的特点，创建一个set用于存放不同的食材
            3、输出set的size即可
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            String array[] = s.split(" ");
            for(int i =0;i<array.length;i++){
                set.add(array[i]);
            }
        }
        System.out.println(set.size());
    }
}
