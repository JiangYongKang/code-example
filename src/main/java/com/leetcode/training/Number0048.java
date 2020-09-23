package com.leetcode.training;

/**
 * Author: vincent
 * Date: 2020/9/23 5:10 下午
 * Comment: 0048. 旋转图像
 */

public class Number0048 {

    /**
     * 最直接的想法是先转置矩阵，然后翻转每一行
     *
     * @param matrix
     */
    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = i; k < matrix[i].length; k++) {
                int tmp = matrix[i][k];
                matrix[i][k] = matrix[k][i];
                matrix[k][i] = tmp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length / 2; k++) {
                int tmp = matrix[i][k];
                matrix[i][k] = matrix[i][matrix.length - k - 1];
                matrix[i][matrix.length - k - 1] = tmp;
            }
        }
    }

}
