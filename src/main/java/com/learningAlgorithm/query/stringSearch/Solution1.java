package com.learningAlgorithm.query.stringSearch;

/**
 * 蛮力匹配方法
 */
public class Solution1 {

    int violentMatch(char[] s, char[] p){
        int sLen = s.length;
        int pLen = p.length;

        int i = 0,j = 0;

        while (i < sLen && j < pLen){
            if (s[i] == p[j]){
                i++;
                j++;
            } else {
                i = i-j+1;
                j = 0;
            }
        }

        if (j == pLen){
            return i - j;
        } else {
            return -1;
        }
    }

}
