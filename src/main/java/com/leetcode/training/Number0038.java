package com.leetcode.training;

/**
 * Author: vincent
 * Date: 2020-11-03 11:41
 * Comment: 0038. 外观数列
 */

public class Number0038 {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder builder = new StringBuilder();
        String str = countAndSay(n - 1);
        int length = str.length();
        int start = 0;
        for (int i = 1; i < length + 1; i++) {
            if (i == length) {
                builder.append(i - start).append(str.charAt(start));
            } else if (str.charAt(i) != str.charAt(start)) {
                builder.append(i - start).append(str.charAt(start));
                start = i;
            }
        }
        return builder.toString();
    }
}
