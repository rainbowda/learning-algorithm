package com.learningAlgorithm.string.permutation;

/**
 * 递归实现
 */
public class Solution1 {

    void calcAllPermutation(char[] perm, int from, int to)
    {
        if (to <= 1)
        {
            return;
        }

        if (from == to)
        {
            for (int i = 0; i <= to; i++){
                //                cout << perm[i];
            }
//            cout << endl;
        }
        else
        {
            for (int j = from; j <= to; j++)
            {
                swap(perm[j], perm[from]);
                calcAllPermutation(perm, from + 1, to);
                swap(perm[j], perm[from]);
            }
        }
    }

    private void swap(char c, char c1) {

    }


}
