package com.learningAlgorithm.array.climbStairs;

/**
 * 递推
 */
public class Solution2 {
    //1, 1, 2, 3, 5, 8, 13, 21..
    static int climbStairs(int n) {
        int dp[] = {0, 1, 1};
        if (n < 2) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }

}
