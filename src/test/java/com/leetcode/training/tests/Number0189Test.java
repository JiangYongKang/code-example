package com.leetcode.training.tests;

import com.leetcode.training.Number0189;
import org.junit.Assert;
import org.junit.Test;

public class Number0189Test {

    @Test
    public void rotateTest() {
        Assert.assertArrayEquals(Number0189.rotate(new int[]{ 1, 2, 3, 4, 5, 6, 7 }, 3), new int[]{ 5, 6, 7, 1, 2, 3, 4 });
        Assert.assertArrayEquals(Number0189.rotate(new int[]{ -1, -100, 3, 99 }, 2), new int[]{ 3, 99, -1, -100 });
    }

}
