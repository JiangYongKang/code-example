package com.leetcode.training.tests;

import com.leetcode.training.Number0001;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/23 2:50 下午
 * Comment:
 */

public class Number0001Test {

    @Test
    public void twoSumTest() {
        Assert.assertArrayEquals(Number0001.twoSum(new int[]{ 2, 7, 11, 15 }, 9), new int[]{ 0, 1 });
        Assert.assertArrayEquals(Number0001.twoSum2(new int[]{ 2, 7, 11, 15 }, 9), new int[]{ 0, 1 });
    }

}
