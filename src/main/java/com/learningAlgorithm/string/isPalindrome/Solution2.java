package com.learningAlgorithm.string.isPalindrome;

/**
 * 中间往两头扫
 */
public class Solution2 {

    static boolean isPalindrome(char[] s) {
        if (s == null || s.length < 1) {
            return false;
        }

        // m定位到字符串的中间位置
        int m = ((s.length >> 1) - 1) >= 0 ? (s.length >> 1) - 1 : 0;
        int first = m;
        int second = s.length - 1 - m;

        while (first >= 0) {
            if (s[first] != s[second]) {
                return false;
            }
            --first;
            ++second;
        }
        return true;
    }

    public static void main(String[] args) {
        char[] s = {'m', 'a', 'd', 'a', 'm'};
        System.out.println(isPalindrome(s));
    }
}
