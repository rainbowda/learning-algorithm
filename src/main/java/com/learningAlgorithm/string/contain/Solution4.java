package com.learningAlgorithm.string.contain;

/**
 * 位运算法
 */
public class Solution4 {

    // “最好的方法”，时间复杂度O(n + m)，空间复杂度O(1)
    static boolean stringContain(String a, String b) {
        int hash = 0;
        for (int i = 0; i < a.length(); ++i) {
            hash |= (1 << (a.charAt(i) - 'A'));
        }
        for (int i = 0; i < b.length(); ++i) {
            if ((hash & (1 << (b.charAt(i) - 'A'))) == 0) {
                return false;
            }
        }
        return true;
    }
}
