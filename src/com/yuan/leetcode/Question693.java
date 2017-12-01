package com.yuan.leetcode;

/**
 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
 * <p>
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation:
 * The binary representation of 5 is: 101
 * <p>
 * Example 2:
 * Input: 7
 * Output: False
 * Explanation:
 * The binary representation of 7 is: 111.
 * <p>
 * Example 3:
 * Input: 11
 * Output: False
 * Explanation:
 * The binary representation of 11 is: 1011.
 * <p>
 * Example 4:
 * Input: 10
 * Output: True
 * Explanation:
 * The binary representation of 10 is: 1010.
 */
public class Question693 {
    public boolean hasAlternatingBits(int n) {

        boolean topFind = false;
        int flag = 1;
        for (int i = 31; i > 0; i--) {
            //找到最高位
            int currentBit = 1 << i & n;
            if (!topFind) {
                if (currentBit != 0) {
                    topFind = true;
                } else {
                    continue;
                }
            }

            //相邻位异或
            int j = i - 1;
            int nextBit = 1 << j & n;

            flag = (currentBit >> i) ^ (nextBit >> j);
            if (flag == 0) {
                break;
            }
        }

        return flag == 1;
    }

    /**
     * We can get the last bit and the rest of the bits via n % 2 and n // 2 operations. Let's remember cur,
     * the last bit of n. If the last bit ever equals the last bit of the remaining, then two adjacent bits have
     * the same value, and the answer is False. Otherwise, the answer is True.
     * <p>
     * Also note that instead of n % 2 and n // 2, we could have used operators n & 1 and n >>= 1 instead.
     */
    public boolean bestSolution(int n) {
        int cur = n % 2;
        n /= 2;
        while (n > 0) {
            if (cur == n % 2) return false;
            cur = n % 2;
            n /= 2;
        }
        return true;
    }
}
