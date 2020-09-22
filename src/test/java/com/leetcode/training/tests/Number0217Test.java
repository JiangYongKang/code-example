package com.leetcode.training.tests;

import com.leetcode.training.Number0217;
import org.junit.Assert;
import org.junit.Test;

public class Number0217Test {

    @Test
    public void containsDuplicateTest() {
        Assert.assertTrue(Number0217.containsDuplicate(new int[]{ 1, 2, 3, 1 }));
        Assert.assertFalse(Number0217.containsDuplicate(new int[]{ 1, 2, 3, 4 }));
        Assert.assertTrue(Number0217.containsDuplicate(new int[]{ 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
        Assert.assertTrue(Number0217.containsDuplicate2(new int[]{ 1, 2, 3, 1 }));
        Assert.assertFalse(Number0217.containsDuplicate2(new int[]{ 1, 2, 3, 4 }));
        Assert.assertTrue(Number0217.containsDuplicate2(new int[]{ 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
    }

}
