package com.yuan.leetcode;

/**
 * Judge Route Circle
 * <p>
 * Initially, there is a Robot at position (0, 0).
 * Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
 * <p>
 * The move sequence is represented by a string. And each move is represent by a character.
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down).
 * The output should be true or false representing whether the robot makes a circle.
 * <p>
 * Example 1:
 * Input: "UD"
 * Output: true
 * <p>
 * Example 2:
 * Input: "LL"
 * Output: false
 */
public class Question657 {
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        int steps = moves.length();
        for (int i = 0; i < steps; i++) {
            char step = moves.charAt(i);
            switch (step) {
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}
