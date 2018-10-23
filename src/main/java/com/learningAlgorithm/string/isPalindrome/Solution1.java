package com.learningAlgorithm.string.isPalindrome;

/**
 * 两头往中间扫
 */
public class Solution1 {

    static boolean isPalindrome(char[] s) {
        // 非法输入
        if (s == null || s.length < 1) {
            return false;
        }


        // 初始化头指针和尾指针
        int front = 0;
        int back = s.length - 1;


        while (front < back) {
            if (s[front] != s[back]) {
                return false;
            }
            ++front;
            --back;
        }
        return true;
    }

    public static void main(String[] args) {
        char[] s = {'m','a','d','a','m'};
        System.out.println(isPalindrome(s));
    }
}
