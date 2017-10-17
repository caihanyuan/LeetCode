package com.yuan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 575. Distribute Candies
 * <p>
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
 * <p>
 * Example 1:
 * Input: candies = [1,1,2,2,3,3]
 * Output: 3
 * <p>
 * Explanation:
 * There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
 * Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
 * The sister has three different kinds of candies.
 * <p>
 * Example 2:
 * Input: candies = [1,1,2,3]
 * Output: 2
 * <p>
 * Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
 * The sister has two different kinds of candies, the brother has only one kind of candies.
 * <p>
 * Note:
 * <p>
 * The length of the given array is in range [2, 10,000], and will be even.
 * The number in given array is in range [-100,000, 100,000].
 */
public class Question575 {
    public static int distributeCandies(int[] candies) {
        int size = candies.length;
        int half = size / 2;
        Map<Integer, Integer> sisterKind = new HashMap<>(half);
        for (int i = 0; i < size; i++) {
            if (sisterKind.size() < half) {
                int candy = candies[i];
                if (!sisterKind.containsKey(candy)) {
                    sisterKind.put(candy, candy);
                }
            } else {
                break;
            }
        }

        return sisterKind.size();
    }
}
