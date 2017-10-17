package com.yuan.leetcode;

/**
 * 557. Reverse Words in a String III
 *
 * Given a string, you need to reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * <p>
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class Question557 {
    public static String reverseWords(String s) {
        int size = s.length();
        char[] words = s.toCharArray();
        int start = 0;
        for (int i = 0; i < size; i++) {
            if (words[i] == 32 || i == size - 1) {
                int end = i == size - 1 ? i + 1 : i;
                int len = end - start;
                int middle = len / 2;
                for (int j = 0; j < middle; j++) {
                    char tmp = words[start + j];
                    words[start + j] = words[end - j - 1];
                    words[end - j - 1] = tmp;
                }

                start = i + 1;
            }
        }

        return new String(words);
    }
}
