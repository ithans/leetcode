package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//        有效字符串需满足：
//
//        左括号必须用相同类型的右括号闭合。
//        左括号必须以正确的顺序闭合。
//        注意空字符串可被认为是有效字符串。

public class Leetcode20 {
    Map<Character,Character> map;
    Leetcode20(){
        map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
    }
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                Character c = stack.isEmpty()?'#':stack.pop();
                if (c != map.get(s.charAt(i))){
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
