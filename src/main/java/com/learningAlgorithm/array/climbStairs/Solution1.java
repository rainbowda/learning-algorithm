package com.learningAlgorithm.array.climbStairs;

/**
 * 递归
 */
public class Solution1 {

    long Fibonacci(int n) {
        int result[] = {0, 1, 2};
        if (n <= 2)
            return result[n];

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }


}
