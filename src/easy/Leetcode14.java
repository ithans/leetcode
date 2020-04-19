package easy;

//编写一个函数来查找字符串数组中的最长公共前缀。
//
//        如果不存在公共前缀，返回空字符串 ""。
public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String pre = strs[0];
        for (int i=1;i<strs.length;i++){
            while (strs[i].indexOf(pre)!=0){
                pre =pre.substring(0,pre.length()-1);
                if (pre.isEmpty()){
                    return "";
                }
            }
        }
        return pre;
    }
}
