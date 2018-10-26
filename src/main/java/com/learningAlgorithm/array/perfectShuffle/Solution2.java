package com.learningAlgorithm.array.perfectShuffle;

/**
 * 完美洗牌算法
 */
public class Solution2 {

    /**
     * 位置置换算法
     *
     * @param array
     */
    static void locationReplace(int[] array) {
        int n = array.length * 2;
        int[] copyArray = new int[array.length];

        for (int i = 1; i <= n; i++) {
            copyArray[(i * 2) % (n + 1)] = array[i];
        }

        for (int i = 0; i <= n; i++) {
            array[i] = copyArray[i];
        }
    }


    /**
     * 走环算法
     *
     * @param array
     * @param from
     * @param mod
     */
    static void cycleLeader(int[] array, int from, int mod) {
        int t, i;

        for (i = from * 2 % mod; i != from; i = i * 2 % mod) {
            t = array[i];
            array[i] = array[from];
            array[from] = t;
        }
    }

    void reverse(int[] array, int from, int to) {
        int t;
        for (; from < to; ++from, --to) {
            t = array[from];
            array[from] = array[to];
            array[to] = t;
        }
    }

    //循环右移num位 时间复杂度O(n)
    void rightRotate(int[] array, int num, int n) {
        reverse(array, 1, n - num);
        reverse(array, n - num + 1, n);
        reverse(array, 1, n);
    }

    void perfectShuffle(int[] array, int n)
    {
        int n2, m, i, k, t;
        for (; n > 1;)
        {
            // step 1
            n2 = n * 2;
            for (k = 0, m = 1; n2 / m >= 3; ++k, m *= 3)
                ;
            m /= 2;
            // 2m = 3^k - 1 , 3^k <= 2n < 3^(k + 1)

            // step 2
            rightRotate(array, m, n);

            // step 3
            for (i = 0, t = 1; i < k; ++i, t *= 3)
            {
                cycleLeader(array , t, m * 2 + 1);
            }

            //step 4
            //array += m * 2;??
            n -= m;

        }
        // n = 1
        t = array[1];
        array[1] = array[2];
        array[2] = t;
    }

}
