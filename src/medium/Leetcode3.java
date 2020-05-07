package medium;

import java.util.HashSet;
import java.util.Set;

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int r = -1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (r + 1 < n && !set.contains(s.charAt(r + 1))) {
                set.add(s.charAt(r + 1));
                r++;
            }
            result = Math.max(result, r - i + 1);
        }
        return result;
    }
}
