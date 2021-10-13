package com.learningAlgorithm.leetcode._offer069peakIndexInMountainArray;


/**
 *
 */
class Solution1 {

    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for (int i = 1; i < n - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                ans = i;
                break;
            }
        }
        return ans;
    }

}