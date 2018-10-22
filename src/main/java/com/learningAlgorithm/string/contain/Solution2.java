package com.learningAlgorithm.string.contain;

/**
 *  排序后轮序
 */
public class Solution2 {
    static boolean stringContain(String a, String b){
        sort(a);
        sort(b);

        for (int pa = 0,pb = 0;pb < b.length();){
            while ((pa <a.length()) && (a.charAt(pa) < b.charAt(pb))){
                ++pa;
            }

            if ((pa >= a.length()) || (a.charAt(pa) > b.charAt(pb))){
                return false;
            }
            ++pb;
        }
        return true;
    }

    private static void sort(String a) {
        //排序字符串
    }

    public static void main(String[] args) {
        System.out.println(Solution1.stringContain("ABCD", "BCD"));
        System.out.println(Solution1.stringContain("ABCD", "BCE"));
        System.out.println(Solution1.stringContain("ABCD", "AA"));
    }

}
