package com.leetcode.training.tests;

import com.leetcode.training.Number0122;
import org.junit.Assert;
import org.junit.Test;

public class Number0122Test {

    @Test
    public void maxProfitTest() {
        Assert.assertEquals(Number0122.maxProfit(new int[]{ 7, 1, 5, 3, 6, 4 }), 7);
        Assert.assertEquals(Number0122.maxProfit(new int[]{ 1, 2, 3, 4, 5 }), 4);
        Assert.assertEquals(Number0122.maxProfit(new int[]{ 7, 6, 4, 3, 1 }), 0);
    }

}
