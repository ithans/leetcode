package easy;

import java.util.HashMap;
import java.util.Map;
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个整数，并返回他们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
public class Leetcode1 {

    //暴力求解
    public int[] twoSumFuction1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //两遍hash
    public int[] twoSumFuction2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (map.containsKey(res) && res != nums[i]) {
                return new int[]{i, map.get(res)};
            }
        }
        return null;
    }

    //一遍hash
    public int[] twoSumFuction3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (map.containsKey(res)) {
                return new int[]{i, map.get(res)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
