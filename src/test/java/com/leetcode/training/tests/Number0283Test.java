package com.leetcode.training.tests;

import com.leetcode.training.Number0283;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/23 12:41 下午
 * Comment:
 */

public class Number0283Test {

    @Test
    public void moveZeroesTest() {
        int[] nums = new int[]{ 0, 1, 0, 3, 12 };
        Number0283.moveZeroes(nums);
        Assert.assertArrayEquals(nums, new int[]{ 1, 3, 12, 0, 0 });
    }

}
