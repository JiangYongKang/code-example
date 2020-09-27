package com.leetcode.training.tests;

import com.leetcode.training.Number0008;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/24 4:46 下午
 * Comment:
 */

public class Number0008Test {

    @Test
    public void myAtoiTest() {
        Assert.assertEquals(Number0008.myAtoi("42"), 42);
        Assert.assertEquals(Number0008.myAtoi("   -42"), -42);
        Assert.assertEquals(Number0008.myAtoi("4193 with words"), 4193);
        Assert.assertEquals(Number0008.myAtoi("words and 987"), 0);
        Assert.assertEquals(Number0008.myAtoi("-91283472332"), -2147483648);
    }

}
