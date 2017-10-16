package com.yuan.leetcode;

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * <p>
 * Example:
 * Input: [1,4,3,2]
 * <p>
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 * <p>
 * Note:
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
 */
public class Question561 {
    public static int arrayPairSum(int[] nums) {
        QuickSort.quickSort(nums, 0, nums.length - 1);

        int sum = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}

/**
 * Best Solution
 * <p>
 * public static int arrayPairSum(int[] nums) {
 * int[] count = new int[20001];
 * for(int i=0; i<nums.length; i++)
 * count[nums[i]+10000]++;
 * boolean odd = true;
 * int sum=0;
 * for(int j=0; j<20001; j++){
 * while(count[j]>0){
 * if(odd){
 * sum = sum+j-10000;
 * }
 * count[j]--;
 * odd=!odd;
 * }
 * }
 * return sum;
 * }
 */
