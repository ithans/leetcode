package easy;
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//你可以假设数组中无重复元素。

public class Leetcode35 {
    public int searchInsert1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    public int searchInsert2(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            }
        }
        return l;
    }
}
