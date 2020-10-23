package com.leetcode.training.tests;

import com.leetcode.training.Number0014;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author vincent
 * @since
 */

public class Number0014Test {
    @Test
    public void longestCommonPrefixTest() {
        Assert.assertEquals(Number0014.longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
        Assert.assertEquals(Number0014.longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
    }
}
