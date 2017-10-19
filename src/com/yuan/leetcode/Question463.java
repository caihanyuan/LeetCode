package com.yuan.leetcode;

/**
 * 463. Island Perimeter
 * <p>
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water,
 * and there is exactly one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
 * One cell is a square with side length
 * 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 * <p>
 * Example:
 * <p>
 * [[0,1,0,0],
 * [1,1,1,0],
 * [0,1,0,0],
 * [1,1,0,0]]
 * <p>
 * Answer: 16
 * Explanation: The perimeter is the 16 yellow stripes in the image below:
 */
public class Question463 {

    public static int islandPerimeter(int[][] grid) {
        int lines = 0;
        int row = grid.length;
        int column = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int value = grid[i][j];
                if (value == 1) {
                    //top
                    if (i == 0) {
                        lines++;
                    } else if (grid[i - 1][j] == 0) {
                        lines++;
                    }
                    //left
                    if (j == 0) {
                        lines++;
                    } else if (grid[i][j - 1] == 0) {
                        lines++;
                    }
                    //bottom
                    if (i == row - 1) {
                        lines++;
                    } else if (grid[i + 1][j] == 0) {
                        lines++;
                    }
                    //right
                    if (j == column - 1) {
                        lines++;
                    } else if (grid[i][j + 1] == 0) {
                        lines++;
                    }
                }
            }
        }
        return lines;
    }

}
