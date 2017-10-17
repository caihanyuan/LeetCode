package com.yuan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * <p>
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * <p>
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 */
public class Question500 {
    public String[] findWords(String[] words) {
        int tmpArr[] = new int[500];
        char[] alphabet = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P',
                'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L',
                'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        int size = alphabet.length;
        for (int i = 0; i < size; i++) {
            char t = alphabet[i];
            tmpArr[t] = i;
            tmpArr[t + 32] = i;
        }

        List<String> resultList = new ArrayList<>();
        size = words.length;
        for (int i = 0; i < size; i++) {
            String word = words[i];
            int innerSize = word.length();
            int lineFlag = -1;
            boolean lineSame = true;
            for (int j = 0; j < innerSize; j++) {
                char c = word.charAt(j);
                int code = tmpArr[c];
                int line = code < 10 ? 1 : code < 19 ? 2 : 3;
                if (lineFlag != -1 && lineFlag != line) {
                    lineSame = false;
                    break;
                }
                lineFlag = line;
            }
            if (lineSame) {
                resultList.add(word);
            }
        }
        String[] results = new String[resultList.size()];
        resultList.toArray(results);
        return results;
    }
}
