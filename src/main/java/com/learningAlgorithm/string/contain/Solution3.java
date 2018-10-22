package com.learningAlgorithm.string.contain;

/**
 * 素数相乘
 */
public class Solution3 {

    //此方法只有理论意义，因为整数乘积很大，有溢出风险
    static boolean StringContain(String a, String b) {
        int p[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        int f = 1;
        for (int i = 0; i < a.length(); ++i) {
            int x = p[a.charAt(i) - 'A'];
            if (f % x != 0) {
                f *= x;
            }
        }
        for (int i = 0; i < b.length(); ++i) {
            int x = p[b.charAt(i) - 'A'];
            if (f % x != 0) {
                return false;
            }
        }
        return true;
    }


}
