package com.leetcode.training.tests;

import com.leetcode.training.Number0038;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020-11-03 11:51
 * Comment:
 */

public class Number0038Test {

    @Test
    public void countAndSayTest() {
        Assert.assertEquals(Number0038.countAndSay(1), "1");
        Assert.assertEquals(Number0038.countAndSay(4), "1211");
    }

}
