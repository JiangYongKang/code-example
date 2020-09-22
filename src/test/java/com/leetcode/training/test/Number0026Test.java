package com.leetcode.training.test;

import com.leetcode.training.Number0026;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Number0026Test {

    @Test
    public void removeDuplicatesTest() {
        int[] sourceNum = new int[]{ 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int size = Number0026.removeDuplicates(sourceNum);
        Assert.assertEquals(size, 5);
        System.out.println(Arrays.toString(sourceNum));
    }

}
