package com.learningAlgorithm.query.findOneNumber;

/**
 * 记录两个值
 */
public class Solution1 {


    int findOneNUmber(int[] array){
        int candidate = array[0];
        int nTimes = 1;

        for (int i = 1; i < array.length; i++) {
            if (nTimes == 0){
                candidate = array[i];
                nTimes = 1;
            } else {
                if (candidate == array[i]){
                    nTimes++;
                } else {
                    nTimes--;
                }
            }
        }

        return candidate;
    }
}
