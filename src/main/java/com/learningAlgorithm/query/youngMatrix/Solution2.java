package com.learningAlgorithm.query.youngMatrix;

/**
 * 定位法
 */
public class Solution2 {

    boolean YoungMatrix(int[][] array,int row, int col, int searchKey){
        int i = 0, j = col - 1;
        int var = array[i][j];
        while (true){
            if (var == searchKey)
                return true;
            else if (var < searchKey && i < row - 1)
                var = array[++i][j];
            else if (var > searchKey && j > 0)
                var = array[i][--j];
            else
                return false;
        }
    }

}
