package com.leetcode.training.tests;

import com.leetcode.training.Number0242;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/23 9:51 下午
 * Comment:
 */

public class Number0242Test {

    @Test
    public void isAnagramTest() {
        Assert.assertTrue(Number0242.isAnagram("anagram", "nagaram"));
        Assert.assertFalse(Number0242.isAnagram("rat", "car"));
    }

}
