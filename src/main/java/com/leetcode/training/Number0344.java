package com.leetcode.training;

/**
 * Author: vincent
 * Date: 2020/9/23 5:28 下午
 * Comment: 0344. 反转字符串
 */

public class Number0344 {

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

}
