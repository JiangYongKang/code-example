package com.leetcode.training;

/**
 * Author: vincent
 * Date: 2020/9/27 8:10 下午
 * Comment: 0028. 实现 strStr()
 */

public class Number0028 {

    /**
     * 使用滑动窗口实现
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        for (int i = 0; i < h - n + 1; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
