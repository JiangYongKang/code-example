package com.leetcode.training;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: vincent
 * Date: 2020/9/23 2:50 下午
 * Comment: 0001. 两数之和
 */

public class Number0001 {

    /**
     * 暴力法很简单，遍历每个元素 xx，并查找是否存在一个值与 target - x 相等的目标元素。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[]{ i, k };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在 target - x 对应的目标元素。如果它存在，那我们已经找到了对应解，并立即将其返回。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
