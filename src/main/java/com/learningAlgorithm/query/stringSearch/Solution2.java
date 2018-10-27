package com.learningAlgorithm.query.stringSearch;

/**
 * KMP算法
 */
public class Solution2 {

    int kmpSearch(char[] s, char[] p){
        int sLen = s.length;
        int pLen = p.length;

        int i = 0,j = 0;

        while (i < sLen && j < pLen){
            if (j == -1 || s[i] == p[j]){
                i++;
                j++;
            } else {
                //j = next[j];
            }
        }

        if (j == pLen){
            return i - j;
        } else {
            return -1;
        }
    }

}
