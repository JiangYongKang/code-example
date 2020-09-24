package com.leetcode.training.tests;

import com.leetcode.training.Number0387;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/23 9:21 下午
 * Comment:
 */

public class Number0387Test {

    @Test
    public void firstUniqCharTest() {
        Assert.assertEquals(Number0387.firstUniqChar("leetcode"), 0);
        Assert.assertEquals(Number0387.firstUniqChar("loveleetcode"), 2);
    }

}
