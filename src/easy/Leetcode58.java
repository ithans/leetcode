package easy;

//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
//如果不存在最后一个单词，请返回 0 。
public class Leetcode58 {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        if (s1 == null || s1.length == 0) {
            return 0;
        } else {
            return s1[s1.length-1].length();
        }
    }
}
