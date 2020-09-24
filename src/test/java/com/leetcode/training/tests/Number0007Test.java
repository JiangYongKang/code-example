package com.leetcode.training.tests;

import com.leetcode.training.Number0007;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/23 8:51 下午
 * Comment:
 */

public class Number0007Test {

    @Test
    public void reverseTest() {
        Assert.assertEquals(Number0007.reverse(123), 321);
        Assert.assertEquals(Number0007.reverse(-123), -321);
        Assert.assertEquals(Number0007.reverse(120), 21);
    }

}
