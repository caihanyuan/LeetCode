package com.yuan.leetcode;


/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * Note:
 * 0 ≤ x, y < 231.
 * <p>
 * Example:
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation: <br>
 * 1   (0 0 0 1) <br>
 * 4   (0 1 0 0)  <br>
 *        ↑   ↑  <br>
 * <p>
 * The above arrows point to positions where the corresponding bits are different.
 */
public class Question461 {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        for (int i = 0; i < 32; i++) {
            if ((1 << i & x) != (1 << i & y)) {
                distance++;
            }
        }
        return distance;
    }
}
