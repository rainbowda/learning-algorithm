package com.learningAlgorithm.array.perfectShuffle;

/**
 * 蛮力转换
 */
public class Solution1 {

    /**
     * 步步前移
     * 第①步、确定b1的位置，即让b1跟它前面的a2，a3，a4交换：
     * a1，b1，a2，a3，a4，b2，b3，b4
     * 第②步、接着确定b2的位置，即让b2跟它前面的a3，a4交换：
     * a1，b1，a2，b2，a3，a4，b3，b4
     * 第③步、b3跟它前面的a4交换位置：
     * a1，b1，a2，b2，a3，b3，a4，b4
     */


    /**
     * 中间交换
     *
     * 第①步：交换最中间的两个元素a4，b1，序列变成（待交换的元素用粗体表示）：
     * a1，a2，a3，b1，a4，b2，b3，b4
     * 第②步，让最中间的两对元素各自交换：
     * a1，a2，b1，a3，b2，a4，b3，b4
     * 第③步，交换最中间的三对元素，序列变成：
     * a1，b1，a2，b2，a3，b3，a4，b4
     */

}
