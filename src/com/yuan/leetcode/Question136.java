package com.yuan.leetcode;

/**
 * 136. Single Number
 * <p>
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class Question136 {
    public int singleNumber(int[] nums) {
        int single = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            single = single ^ nums[i];
        }
        return single;
    }
}
