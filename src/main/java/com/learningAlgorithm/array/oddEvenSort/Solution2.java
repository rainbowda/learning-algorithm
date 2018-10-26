package com.learningAlgorithm.array.oddEvenSort;

/**
 * 一前一后指针往中后扫描
 */
public class Solution2 {

    //判断是否为奇数
    static boolean isOddNumber(int data) {
        return (data & 1) == 1;
    }

    //奇偶互换
    static void oddEvenSort2(int data[], int lo, int hi)
    {
        int i = lo - 1;
        for (int j = lo; j < hi; j++)
        {
            //data[j]指向奇数，交换
            if ( isOddNumber(data[j]) )
            {
                i = i + 1;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, hi);
    }

    private static void swap(int[] pData, int pBegin, int pEnd) {
        int i = pData[pBegin];
        pData[pBegin] = pData[pEnd];
        pData[pEnd] = i;
    }
}
