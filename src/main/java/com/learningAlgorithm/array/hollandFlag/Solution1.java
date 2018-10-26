package com.learningAlgorithm.array.hollandFlag;

/**
 *
 */
public class Solution1 {

    static void hollandFlag(int[] array){
        int begin = 0,current = 0, end = array.length-1;

        while (current <= end){
            if (array[current] == 0){
                swap(array,current, begin);
                current++;
                begin++;
            } else if (array[current] == 1){
                current++;
            } else if (array[current] == 2){
                swap(array,current,end);
                end--;
            }
        }
    }

    private static void swap(int[] pData, int pBegin, int pEnd) {
        int i = pData[pBegin];
        pData[pBegin] = pData[pEnd];
        pData[pEnd] = i;
    }

    public static void main(String[] args) {
        int[] array = {1,0,2,1,2,0};

        hollandFlag(array);

        for (int i: array) {
            System.out.println(i);
        }
    }

}
