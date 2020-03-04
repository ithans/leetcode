package easy;

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
