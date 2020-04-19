package easy;
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
public class Leetcode9 {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        } else if (x < 0) {
            return false;
        } else {
            int res = 0;
            int ori =x;
            while (x != 0) {
                int pop = x % 10;
                x = x/10;
                res = res*10 +pop;
            }
            return res ==ori;
        }
    }
}
