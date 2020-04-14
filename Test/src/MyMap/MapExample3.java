package MyMap;

import java.util.HashSet;
import java.util.Set;

public class MapExample3 {
    //宝石与石头
    /*
    题目描述：
            给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
             S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。

    注意：
            1、J 中的字母不重复，J 和 S中的所有字符都是字母。
            2、字母区分大小写，因此"a"和"A"是不同类型的石头。

    思路：
            1、遍历字符串J，将J中所有宝石类型放到一个set中；
            2、遍历字符串S，用S的每个元素到set中查找，若找到即为宝石
     */
    public int numJewelsInStones(String J, String S){
        Set<Character> set = new HashSet<>();
        for(char c : J.toCharArray()){
            set.add(c);
        }
        int ret = 0;
        for(char c:S.toCharArray()){
            if(set.contains(c)){
                ret++;
            }
        }
        return ret;
    }
}
