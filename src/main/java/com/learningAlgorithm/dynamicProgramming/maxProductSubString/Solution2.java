package com.learningAlgorithm.dynamicProgramming.maxProductSubString;

import static java.lang.Double.max;
import static java.lang.Double.min;

/**
 * 动态规划
 */
public class Solution2 {

    double MaxProductSubstring(double[] array)
    {
        double maxEnd = array[0];
        double minEnd = array[0];
        double maxResult = array[0];
        for (int i = 1; i < array.length; ++i)
        {
            double end1 = maxEnd * array[i], end2 = minEnd * array[i];
            maxEnd = max(max(end1, end2), array[i]);
            minEnd = min(min(end1, end2), array[i]);
            maxResult = max(maxResult, maxEnd);
        }
        return maxResult;
    }



}
