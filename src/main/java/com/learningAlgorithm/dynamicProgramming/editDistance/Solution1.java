package com.learningAlgorithm.dynamicProgramming.editDistance;


import static java.lang.Integer.min;

/**
 *
 */
public class Solution1 {


    int EditDistance(char[] pSource, char[] pTarget)
    {
        int srcLength = pSource.length;
        int targetLength = pTarget.length;
        int i, j;
        int[][] dp = new int[pSource.length][pTarget.length];
        //边界dp[i][0] = i，dp[0][j] = j
        for (i = 1; i <= srcLength; ++i)
        {
            dp[i][0] = i;
        }
        for (j = 1; j <= targetLength; ++j)
        {
            dp[0][j] = j;
        }
        for (i = 1; i <= srcLength; ++i)
        {
            for (j = 1; j <= targetLength; ++j)
            {
                if (pSource[i - 1] == pTarget[j - 1])
                {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else
                {
                    dp[i][j] = 1 + min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[srcLength][targetLength];
    }
}
