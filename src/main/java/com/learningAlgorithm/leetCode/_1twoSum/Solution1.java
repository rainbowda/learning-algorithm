package com.learningAlgorithm.leetCode._1twoSum;

import java.util.Arrays;

/**
 * 方法一：暴力枚举
 * 思路及算法
 *
 * 最容易想到的方法是枚举数组中的每一个数 x，寻找数组中是否存在 target - x。
 *
 * 当我们使用遍历整个数组的方式寻找 target - x 时，需要注意到每一个位于 x 之前的元素都已经和 x 匹配过，因此不需要再进行匹配。而每一个元素不能被使用两次，所以我们只需要在 x 后面的元素中寻找 target - x。
 *
 */
class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        for(int firstIndex = 0; firstIndex < nums.length; firstIndex++){
            int firstNum = nums[firstIndex];
            for(int secondIndex = firstIndex+1; secondIndex < nums.length; secondIndex++){
                int secondNum = nums[secondIndex];

                if((firstNum + secondNum) == target){
                    int[] targetArray = {firstIndex, secondIndex};
                    return targetArray;
                }
            }

        }
        return new int[1];
    }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums1, 9)));

        int[] nums2 = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
    }
}