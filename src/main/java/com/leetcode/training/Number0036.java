package com.leetcode.training;

/**
 * Author: vincent
 * Date: 2020/9/23 3:17 下午
 * Comment: 0036. 有效的数独
 */

public class Number0036 {

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                if (board[i][k] != '.') {
                    int num = board[i][k] - '1';
                    int box_index = (i / 3) * 3 + k / 3;
                    if (row[i][num] || col[k][num] || box[box_index][num]) {
                        return false;
                    } else {
                        row[i][num] = true;
                        col[k][num] = true;
                        box[box_index][num] = true;
                    }
                }
            }
        }
        return true;
    }

}
