package com.learningAlgorithm.string.rotate;

/**
 * 三步反转法
 */
public class Solution2 {
    public void reverseString(char[] s, int from, int to){
        while (from < to){
            char c = s[from];
            s[from++] = s[to];
            s[to--] = c;
        }
    }

    public void leftRotateString(char[] s, int n, int m){
        m %= n;
        reverseString(s, 0, m-1);
        reverseString(s, m, n-1);
        reverseString(s, 0, n-1);
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        char[] chars = {'a','b','c','d','e','f'};

        solution.leftRotateString(chars, chars.length, 3);

        System.out.println(chars);
    }
}
