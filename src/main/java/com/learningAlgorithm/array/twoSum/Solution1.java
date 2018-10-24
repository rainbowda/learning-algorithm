package com.learningAlgorithm.array.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 散列映射
 */
public class Solution1 {

    static void twoSum(int[] ints,int sum){
        Map<String, Integer> map = new HashMap<>(ints.length);
        for (int i = 0; i < ints.length; i++) {
            map.put(String.valueOf(ints[i]), ints[i]);
        }

        for (int i = 0; i < ints.length; i++) {
            int remainder = sum - ints[i];

            Integer result = map.get(String.valueOf(remainder));
            if (result != null){
                System.out.println(ints[i] + "-"+result);
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {1,2,4,5,7,11,15};

        twoSum(ints,15);
    }
}
