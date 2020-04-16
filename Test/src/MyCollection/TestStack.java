package MyCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TestStack {
    //括号匹配问题
    /*
    思路：
            1、先用一个map将括号类型存下来，key表示左括号，value表示有括号
            2、创建一个栈用于保存字符类型
            3、遍历字符串中的每个字符
                （1）左括号就入栈；
                （2）右括号就取出栈顶元素比较一下
     */

    public boolean isValid(String s){
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack = new Stack<>();
        for(int i =0;i< s.length();i++){
            char c = s.charAt(i);
            //若是左括号就入栈，进行下一次循环
            if(c == '(' || c == '[' ||  c == '{'){
                stack.push(c);
                continue;
            }
            //若此时不是左括号，且栈为空，即说明没有括号适配
            if(stack.isEmpty()){
                return false;
            }
            //如果是右括号，就取出栈顶元素，进行比较
            char top = stack.pop();
            if(map.get(top) == c){
                continue;
            }
                return false;
        }
        //字符串遍历结束，若栈为空，则表示括号全部匹配
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
