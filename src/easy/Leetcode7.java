package easy;

//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
public class Leetcode7 {
    public int reverse(int x) {
        int res =0;
        while(x != 0){
            int pop = x % 10;
            x = x/10;
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            res = 10*res +pop;
        }
        return res;
    }
}
