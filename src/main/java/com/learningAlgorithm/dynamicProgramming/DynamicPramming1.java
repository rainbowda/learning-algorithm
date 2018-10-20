package com.learningAlgorithm.dynamicProgramming;

/**
 * 切割棒
 * 第一版递归实现
 */
public class DynamicPramming1 {

    /**
     * @param worth  价值
     * @param length 长度
     */
    public static int cutRod(int[] worth, int length) {
        if (length == 0) {
            return 0;
        }

        int value = 0;

        for (int i = 1; i <= length; i++) {
            int nextValue = worth[i] + cutRod(worth, length - i);
            value = value > nextValue ? value : nextValue;
        }

        return value;
    }

    public static void main(String[] args) {
        int[] worth = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

        int length = 8;

        int value = cutRod(worth, length);

        System.out.println(value);
    }

}
