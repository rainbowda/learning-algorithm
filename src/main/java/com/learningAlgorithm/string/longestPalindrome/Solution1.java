package com.learningAlgorithm.string.longestPalindrome;

/**
 * 中心扩展法
 */
public class Solution1 {

    int longestPalindrome(char[] s)
    {
        int i, j, max,c = 0;
        if (s == null || s.length < 1)
            return 0;
        max = 0;

        for (i = 0; i < s.length; ++i) { // i is the middle point of the palindrome
            for (j = 0; (i - j >= 0) && (i + j < s.length); ++j){ // if the length of the palindrome is odd
                if (s[i - j] != s[i + j])
                    break;
                c = j * 2 + 1;
            }
            if (c > max)
                max = c;
            for (j = 0; (i - j >= 0) && (i + j + 1 < s.length); ++j){ // for the even case
                if (s[i - j] != s[i + j + 1])
                    break;
                c = j * 2 + 2;
            }
            if (c > max)
                max = c;
        }
        return max;
    }
}
