package easy;

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
public class Leetcode53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (curr < 0) {
                curr = nums[i];
            }else{
                curr+=nums[i];
            }
            max =max>curr?max:curr;
        }
        return max;
    }
}
