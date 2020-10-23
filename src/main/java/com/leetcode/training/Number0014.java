package com.leetcode.training;

/**
 * @author vincent
 * @since
 * 0014. 最长公共前缀
 */

public class Number0014 {

    /**
     * 横向扫描以此对比出相同的前缀
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String tmp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            tmp = longestCommonPrefix(tmp, strs[i]);
            if (tmp.length() == 0) {
                break;
            }
        }
        return tmp;
    }

    /**
     * 获取两个字符串的公共前缀
     * @param s1
     * @param s2
     * @return
     */
    public static String longestCommonPrefix(String s1, String s2) {
        int index = 0;
        int minLength = Math.min(s1.length(), s2.length());
        while (index < minLength && s1.charAt(index) == s2.charAt(index)) {
            index++;
        }
        return s1.substring(0, index);
    }
}
