package medium;

public class Leetcode12 {
    public String intToRoman(int num) {
        int[] arr1 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] arr1s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr1.length; i++) {
            while (num >= arr1[i]) {
                num -= arr1[i];
                sb.append(arr1s[i]);
            }
        }
        return sb.toString();
    }
}
