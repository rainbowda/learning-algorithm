package com.learningAlgorithm.array.maxSubArray;

/**
 * 动态规划
 */
public class Solution2 {

    int maxSubArray(int[] array) {
        int n = array.length;
        int currSum = 0;
        int maxSum = array[0];       //全负情况，返回最大数

        for (int j = 0; j < n; j++) {
            if (currSum >= 0){
                currSum += array[j];
            } else {
                currSum = array[j];
            }

            if (currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
