package com.leetcode.training.tests;

import com.leetcode.training.Number0026;
import org.junit.Assert;
import org.junit.Test;

public class Number0026Test {

    @Test
    public void removeDuplicatesTest() {
        Assert.assertEquals(Number0026.removeDuplicates(new int[]{ 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }), 5);
    }

}
