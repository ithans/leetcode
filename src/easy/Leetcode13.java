package easy;

//罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
//
//        字符          数值
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
//
//        通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
//
//        I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//        X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//        C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
//        给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

public class Leetcode13 {

    public int romanToInt1(String s) {
        int sum = 0;
        int value = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int value1 = getValue(s.charAt(i));
            if (value < value1) {
                sum = sum - value;
            } else {
                sum = sum + value;
            }
            value = value1;

        }
        sum += value;
        return sum;
    }
    public int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    res = res + 1;
                    break;
                case 'V':
                    res = res + 5;
                    break;
                case 'X':
                    res = res + 10;
                    break;
                case 'L':
                    res = res + 50;
                    break;
                case 'C':
                    res = res + 100;
                    break;
                case 'D':
                    res = res + 500;
                    break;
                case 'M':
                    res = res + 1000;
                    break;
            }
        }
        if (s.contains("IV")) {
            res = res - 2;
        }
        if (s.contains("IX")) {
            res = res - 2;
        }
        if (s.contains("XL")) {
            res = res - 20;
        }
        if (s.contains("XC")) {
            res = res - 20;
        }
        if (s.contains("CD")) {
            res = res - 200;
        }
        if (s.contains("CM")) {
            res = res - 200;
        }

        return res;
    }
}
