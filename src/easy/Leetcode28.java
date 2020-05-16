package easy;

//给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
public class Leetcode28 {
    public static void main(String[] args) {
        int a = strStr1("abjkdh", "bj");
        int b = strStr1("abjkdh", "bj");
        System.out.println(a + "" + b);
    }

    public static int strStr1(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public static int strStr2(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        for (int start = 0; start < m - n + 1; start++) {
            if (haystack.substring(start, start + n).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}
