package com.yuan.leetcode;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * Note:
 * <p>
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class Question485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSize = 0;

        int size = nums.length;
        int tmp = 1;
        int currentNum = 0;
        for (int i = 0; i < size; i++) {
            if ((tmp &= nums[i]) != 0) {
                currentNum++;
            } else {
                tmp = 1;
                maxSize = Math.max(maxSize, currentNum);
                currentNum = 0;
            }

            if (i == size - 1) {
                maxSize = Math.max(maxSize, currentNum);
            }
        }

        return maxSize;
    }
}
