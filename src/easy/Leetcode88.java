package easy;

import java.util.Arrays;

//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
public class Leetcode88 {

    public static void main(String[] args) {
        int[] num1 = {1, 3, 4, 0, 0, 0, 0, 0};
        int m = 3;
        int[] num2 = {2, 5, 6};
        int n = 3;
        merge(num1,m,num2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
