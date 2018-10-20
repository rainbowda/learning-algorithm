package com.learningAlgorithm.dynamicProgramming;

/**
 * 第三版自底向上
 */
public class DynamicPramming3 {

    public static int bottomUpCutRod(int[] worth, int length){
        int[] r = new int[length+1];

        int value = 0;

        for (int j = 1; j <= length; j++) {

            for(int i = 1; i <= j; i++){
                int nextValue = worth[i] + r[j-i];
                value = value > nextValue ? value : nextValue;
            }
            r[j] = value;
        }

        return r[length];
    }

    public static void main(String[] args) {
        int[] worth = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

        int length = 10;

        int value = bottomUpCutRod(worth, length);

        System.out.println(value);
    }
}
