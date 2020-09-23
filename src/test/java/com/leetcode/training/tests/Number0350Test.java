package com.leetcode.training.tests;

import com.leetcode.training.Number0350;
import org.junit.Assert;
import org.junit.Test;

public class Number0350Test {

    @Test
    public void intersectTest() {
        Assert.assertArrayEquals(Number0350.intersect(new int[]{ 1, 2, 2, 1 }, new int[]{ 2, 2 }), new int[]{ 2, 2 });
        Assert.assertArrayEquals(Number0350.intersect(new int[]{ 4, 9, 5 }, new int[]{ 9, 4, 9, 8, 4 }), new int[]{ 9, 4 });
    }

}
