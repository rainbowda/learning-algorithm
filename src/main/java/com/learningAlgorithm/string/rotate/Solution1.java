package com.learningAlgorithm.string.rotate;

/**
 * 暴力移位法
 */
public class Solution1 {

    private void leftShiftOne(char[] chars, int n){
        char c = chars[0];
        for (int i = 1; i < n; i++) {
            chars[i-1] = chars[i];
        }

        chars[n -1] = c;
    }

    public void leftRotateString(char[] chars, int n, int m){
        while ((m--) != 0){
            leftShiftOne(chars, n);
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        char[] chars = {'a','b','c','d','e','f'};

        solution.leftRotateString(chars, chars.length, 3);

        System.out.println(chars);
    }
}
