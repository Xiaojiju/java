package com.sladar.leetcode.array;
/**
  * @author Erys Mo
  * @date 2021/8/27
  * @time 15:22
  * 53. 最大子序和
  * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
  * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。
  **/
public class ArrayIndexMaxSum {

    // 贪心算法
    public static int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count > result) {
                result = count;
            }
            if (count <= 0) {
                count = 0;
            }
        }
        return result;
    }

    // 动态规划
    public static int dpMaxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            if (dp[i] > result) {
                result = dp[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, -2, -3};
        System.out.println(dpMaxSubArray(nums));
    }
}
