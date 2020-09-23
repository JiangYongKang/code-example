package com.leetcode.training.tests;

import com.leetcode.training.Number0048;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/23 5:10 下午
 * Comment:
 */

public class Number0048Test {

    @Test
    public void rotateTest() {
        int[][] matrixOne = new int[][]{
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        Number0048.rotate(matrixOne);
        Assert.assertArrayEquals(matrixOne, new int[][]{ { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } });
        int[][] matrixTwo = new int[][]{
                { 5, 1, 9, 11 },
                { 2, 4, 8, 10 },
                { 13, 3, 6, 7 },
                { 15, 14, 12, 16 },
        };
        Number0048.rotate(matrixTwo);
        Assert.assertArrayEquals(matrixTwo, new int[][]{ { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } });
    }

}
