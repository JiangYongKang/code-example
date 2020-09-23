package com.leetcode.training;

/**
 * Author: vincent
 * Date: 2020/9/23 12:41 下午
 * Comment: 0283. 移动零
 */

public class Number0283 {

    /**
     * 这里参考了快速排序的思想，快速排序首先要确定一个待分割的元素做中间点 x，然后把所有小于等于 x 的元素放到 x 的左边，大于 x 的元素放到其右边。
     * 这里我们可以用 0 当做这个中间点，把不等于 0 (注意题目没说不能有负数)的放到中间点的左边，等于 0 的放到其右边。
     * 这的中间点就是 0 本身，所以实现起来比快速排序简单很多，我们使用两个指针 i 和 k，只要 nums[i] != 0，我们就交换 nums[i] 和 nums[k]
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        for (int i = 0, k = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[k];
                nums[k++] = tmp;
            }
        }
    }

}
