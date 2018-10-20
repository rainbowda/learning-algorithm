package com.learningAlgorithm.dynamicProgramming;

import java.util.Map;

import static com.learningAlgorithm.dynamicProgramming.DynamicPramming1.cutRod;

/**
 * 第二版带备忘的自顶向下
 * 增加备忘功能
 */
public class DynamicPramming2 {

    public static int memoizedCutRod(int[] worth, int length){
        int[] r = new int[length+1];

        return memoizedCutRodAux(worth, length, r);
    }

    /**
     *
     * @param worth
     * @param length
     * @param r
     * @return
     */
    private static int memoizedCutRodAux(int[] worth, int length, int[] r){
        if (r[length] > 0){
            return r[length];
        }

        int value = 0;

        if (length != 0) {
            for (int i = 1; i <= length; i++) {
                int nextValue = worth[i] + memoizedCutRodAux(worth, length - i, r);
                value = value > nextValue ? value : nextValue;
            }
        }

        r[length] = value;

        return value;
    }

    public static void main(String[] args) {
        int[] worth = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

        int length = 10;

        int value = memoizedCutRod(worth, length);

        System.out.println(value);
    }
}
