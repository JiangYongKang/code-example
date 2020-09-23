package com.leetcode.training.tests;

import com.leetcode.training.Number0066;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: Vincent
 * Date: 2020/9/23 12:09 下午
 * Comment:
 */

public class Number0066Test {

    @Test
    public void plusOneTest() {
        Assert.assertArrayEquals(Number0066.plusOne(new int[]{ 1, 2, 3 }), new int[]{ 1, 2, 4 });
        Assert.assertArrayEquals(Number0066.plusOne(new int[]{ 4, 3, 2, 1 }), new int[]{ 4, 3, 2, 2 });
    }

}
