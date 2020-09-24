package com.leetcode.training;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: vincent
 * Date: 2020/9/23 9:20 下午
 * Comment: 0387. 字符串中的第一个唯一字符
 */

public class Number0387 {

    /**
     * 这道题最优的解法就是线性复杂度了，为了保证每个元素是唯一的，至少得把每个字符都遍历一遍。
     * 算法的思路就是遍历一遍字符串，然后把字符串中每个字符出现的次数保存在一个散列表中。这个过程的时间复杂度为 O(N)O(N)，其中 NN 为字符串的长度。
     * 接下来需要再遍历一次字符串，这一次利用散列表来检查遍历的每个字符是不是唯一的。如果当前字符唯一，直接返回当前下标就可以了。第二次遍历的时间复杂度也是 O(N)O(N)。
     *
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

}
