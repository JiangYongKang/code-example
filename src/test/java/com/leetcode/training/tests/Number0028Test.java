package com.leetcode.training.tests;

import com.leetcode.training.Number0028;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/27 8:11 下午
 * Comment:
 */

public class Number0028Test {

    @Test
    public void strStrTest() {
        Assert.assertEquals(Number0028.strStr("hello", "ll"), 2);
        Assert.assertEquals(Number0028.strStr("aaaaa", "bba"), -1);
        Assert.assertEquals(Number0028.strStr("mississippi", "issip"), 4);
    }
}
