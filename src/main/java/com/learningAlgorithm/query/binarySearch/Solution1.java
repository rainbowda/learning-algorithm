package com.learningAlgorithm.query.binarySearch;

/**
 *
 */
public class Solution1 {

    int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        //如果这里是int right = n 的话，那么下面有两处地方需要修改，以保证一一对应：
        //1、下面循环的条件则是while(left < right)
        //2、循环内当 array[middle] > value 的时候，right = mid

        while (left <= right)  //循环条件，适时而变
        {
            int middle = left + ((right - left) >> 1);  //防止溢出，移位也更高效。同时，每次循环都需要更新。

            if (array[middle] > value) {
                right = middle - 1;  //right赋值，适时而变
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
