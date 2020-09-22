package com.leetcode.training;

public class Number0026 {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else {
            int pre = 0;
            int cur = 0;
            int n = nums.length;
            while (cur < n) {
                if (nums[pre] != nums[cur]) {
                    nums[++pre] = nums[cur];
                }
                cur++;
            }
            return pre + 1;
        }
    }

}
