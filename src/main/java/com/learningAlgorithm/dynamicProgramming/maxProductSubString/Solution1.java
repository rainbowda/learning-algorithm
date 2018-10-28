package com.learningAlgorithm.dynamicProgramming.maxProductSubString;

/**
 * 蛮力轮询
 */
public class Solution1 {

    double maxProductSubString(double[] array) {
        double maxResult = array[0];
        for (int i = 0; i < array.length; i++) {
            double x = 1;
            for (int j = i; j < array.length; j++) {
                x *= array[j];
                if (x > maxResult) {
                    maxResult = x;
                }
            }
        }
        return maxResult;
    }

}
