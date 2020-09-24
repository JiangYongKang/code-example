package com.leetcode.training.tests;

import com.leetcode.training.Number0344;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2020/9/23 5:29 下午
 * Comment:
 */

public class Number0344Test {

    @Test
    public void reverseStringTest() {
        char[] charOne = new char[]{ 'h', 'e', 'l', 'l', 'o' };
        Number0344.reverseString(charOne);
        Assert.assertArrayEquals(charOne, new char[]{ 'o', 'l', 'l', 'e', 'h' });
        char[] charTwo = new char[]{ 'H', 'a', 'n', 'n', 'a', 'h' };
        Number0344.reverseString(charTwo);
        Assert.assertArrayEquals(charTwo, new char[]{ 'h', 'a', 'n', 'n', 'a', 'H' });
    }

}
