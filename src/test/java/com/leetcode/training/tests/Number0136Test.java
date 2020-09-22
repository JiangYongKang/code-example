package com.leetcode.training.tests;

import com.leetcode.training.Number0136;
import org.junit.Assert;
import org.junit.Test;

public class Number0136Test {

    @Test
    public void singleNumberTest() {
        Assert.assertEquals(Number0136.singleNumber(new int[]{ 2, 2, 1 }), 1);
        Assert.assertEquals(Number0136.singleNumber(new int[]{ 4, 1, 2, 1, 2 }), 4);
    }

}
