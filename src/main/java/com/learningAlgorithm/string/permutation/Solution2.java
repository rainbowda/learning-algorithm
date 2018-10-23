package com.learningAlgorithm.string.permutation;

/**
 * 字典序排列
 */
public class Solution2 {

    boolean calcAllPermutation(char[] perm, int num){
        int i;

        //①找到排列中最后（最右）一个升序的首位位置i，x = ai
        for (i = num - 2; (i >= 0) && (perm[i] >= perm[i + 1]); --i){
            ;
        }
        // 已经找到所有排列
        if (i < 0){
            return false;
        }

        int k;
        //②找到排列中第i位右边最后一个比ai 大的位置j，y = aj
        for (k = num - 1; (k > i) && (perm[k] <= perm[i]); --k){
            ;
        }

        //③交换x，y
        swap(perm[i], perm[k]);
        //④把第(i+ 1)位到最后的部分翻转
        reverse(perm[ + i + 1], perm[num]);
        return true;
    }

    private void swap(char c, char c1) {
    }

    private void reverse(char c, char c1) {
    }
}
