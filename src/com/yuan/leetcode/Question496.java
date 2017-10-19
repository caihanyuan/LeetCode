package com.yuan.leetcode;

/**
 * 496. Next Greater Element I
 * <p>
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * <p>
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
 * If it does not exist, output -1 for this number.
 * <p>
 * Example 1:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 * <p>
 * Explanation:
 * For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 * For number 1 in the first array, the next greater number for it in the second array is 3.
 * For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 * <p>
 * Example 2:
 * Input: nums1 = [2,4], nums2 = [1,2,3,4].
 * Output: [3,-1]
 * <p>
 * Explanation:
 * For number 2 in the first array, the next greater number for it in the second array is 3.
 * For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
 * <p>
 * Note:
 * All elements in nums1 and nums2 are unique.
 * The length of both nums1 and nums2 would not exceed 1000.
 */
public class Question496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] resultArr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int v = nums1[i];
            boolean has = false;
            for (int j = 0; j < nums2.length; j++) {
                int v2 = nums2[j];
                if (v == v2) {
                    for (int k = j; k < nums2.length; k++) {
                        v2 = nums2[k];
                        if (v2 > v) {
                            has = true;
                            resultArr[i] = v2;
                            break;
                        }
                    }
                }
            }
            if (!has) {
                resultArr[i] = -1;
            }
        }

        return resultArr;
    }


    //best solution
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        if(nums1.length == 0) return new int[]{};
//        int[] ans = new int[nums1.length];
//
//        int max = Integer.MIN_VALUE;
//        for(int num2: nums2) {
//            if(max < num2) max = num2;
//        }
//
//        int[] map = new int[max + 1];
//        Arrays.fill(map, -1);
//
//        for(int i = 0; i < nums2.length; i++) {
//            map[nums2[i]] = i;
//        }
//
//        for(int i = 0; i < nums1.length; i++) {
//            if(nums1[i] == max) ans[i] = -1;
//            else {
//                int index = map[nums1[i]];
//                while(++index < nums2.length) {
//                    if(nums2[index] > nums1[i]) {
//                        ans[i] = nums2[index];
//                        break;
//                    }
//                }
//                if(ans[i] == 0) ans[i] = -1;
//            }
//        }
//        return ans;
//}
}
