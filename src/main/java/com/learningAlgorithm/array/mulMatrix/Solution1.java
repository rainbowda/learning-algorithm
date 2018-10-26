package com.learningAlgorithm.array.mulMatrix;

/**
 * 蛮力解法
 */
public class Solution1 {

    void mulMatrix(int[][] matrixA, int[][] matrixB, int[][] matrixC, int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrixC[i][j] = 0;
                for (int k = 0; k < n; ++k) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    }


}
