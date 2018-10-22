package com.learningAlgorithm.string.contain;

/**
 * 蛮力轮询
 */
public class Solution1 {

    static boolean stringContain(String a, String b){
        for (int i = 0; i < b.length(); i++) {
            int j;
            for (j = 0; (j < a.length()) && (a.charAt(j) != b.charAt(i)); j++);
            if (j >= a.length()){
                return  false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Solution1.stringContain("ABCD", "BCD"));
        System.out.println(Solution1.stringContain("ABCD", "BCE"));
        System.out.println(Solution1.stringContain("ABCD", "AA"));
    }
}
