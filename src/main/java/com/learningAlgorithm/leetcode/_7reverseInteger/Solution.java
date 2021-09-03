package com.learningAlgorithm.leetcode._7reverseInteger;


class Solution {
    public static int reverse(int x) {
        int flag = 1;
        if (x < 0){
            flag = -1;
            x = x * flag;
        }
        StringBuilder  value = new StringBuilder(String.valueOf(x));
        StringBuilder reverse = value.reverse();

        int result = 0;
        try {
            result = flag * Integer.parseInt(reverse.toString());
        }catch (Exception e){}

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}