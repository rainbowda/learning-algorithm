package com.learningAlgorithm.array.maxSubArray;

/**
 * 蛮力枚举
 */
public class Solution1 {

    static int maxSubArray(int[] array) {
        int n = array.length;

        int maxSum = array[0];  //全负情况，返回最大负数
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    currSum += array[k];
                }
                if (currSum > maxSum)
                    maxSum = currSum;

                currSum = 0; //这里要记得清零，否则的话sum最终存放的是所有子数组的和。
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        System.out.println(maxSubArray(array));
    }
}
