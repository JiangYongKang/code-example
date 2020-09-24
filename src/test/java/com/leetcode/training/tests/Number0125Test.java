package com.leetcode.training.tests;

import com.leetcode.training.Number0125;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/24 11:13 上午
 * Comment:
 */

public class Number0125Test {

    @Test
    public void isPalindromeTest() {
        Assert.assertTrue(Number0125.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(Number0125.isPalindrome("race a car"));
        Assert.assertTrue(Number0125.isPalindrome1("A man, a plan, a canal: Panama"));
        Assert.assertFalse(Number0125.isPalindrome1("race a car"));
    }

}
