package com.leetcode.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number0350 {

    /**
     * 方法一：哈希表
     * 由于同一个数字在两个数组中都可能出现多次，因此需要用哈希表存储每个数字出现的次数。对于一个数字，其在交集中出现的次数等于该数字在两个数组中出现次数的最小值。
     * 首先遍历第一个数组，并在哈希表中记录第一个数组中的每个数字以及对应出现的次数，然后遍历第二个数组，对于第二个数组中的每个数字，如果在哈希表中存在这个数字，则将该数字添加到答案，并减少哈希表中该数字出现的次数。
     * 为了降低空间复杂度，首先遍历较短的数组并在哈希表中记录每个数字以及对应出现的次数，然后遍历较长的数组得到交集。
     *
     * @param nums1 数组1
     * @param nums2 数组2
     * @return 两个数组的交集
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            int count = map.getOrDefault(n, 0) + 1;
            map.put(n, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int n : nums2) {
            int count = map.getOrDefault(n, 0);
            if (count > 0) {
                intersection[index++] = n;
                count--;
                if (count > 0) {
                    map.put(n, count);
                } else {
                    map.remove(n);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

}
