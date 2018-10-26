package com.learningAlgorithm.array.oddEvenSort;

/**
 * 一头一尾指针往中间扫描
 */
public class Solution1 {
    //判断是否为奇数
    static boolean isOddNumber(int data) {
        return (data & 1) == 1;
    }

    //奇偶互换
    static void oddEvenSort(int[] pData) {
        int length = pData.length;
        if (pData == null || length == 0)
            return;

        int pBegin = 0;
        int pEnd = length - 1 ;

        while (pBegin < pEnd) {
            //如果pBegin指针指向的是奇数，正常，向右移
            if (isOddNumber(pData[pBegin])) {
                pBegin++;
            }
            //如果pEnd指针指向的是偶数，正常，向左移
            else if (!isOddNumber(pData[pEnd])) {
                pEnd--;
            } else {
                //否则都不正常，交换
                //swap是STL库函数，声明为void swap(int& a, int& b);
                swap(pData, pBegin, pEnd);
            }
        }
    }

    private static void swap(int[] pData, int pBegin, int pEnd) {
        int i = pData[pBegin];
        pData[pBegin] = pData[pEnd];
        pData[pEnd] = i;
    }

    public static void main(String[] args) {
        int[] array = {2, 8, 7, 1, 3, 6, 5, 4};
        oddEvenSort(array);

        for (int i : array) {
            System.out.println(i);
        }

    }

}
