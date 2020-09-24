package com.leetcode.training;

/**
 * Author: vincent
 * Date: 2020/9/24 11:12 上午
 * Comment: 0125. 验证回文串
 */

public class Number0125 {

    /**
     * 正则加字符串反转
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "");
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equalsIgnoreCase(rev);
    }

    /**
     * 双指针比较
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome1(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt((left))) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
