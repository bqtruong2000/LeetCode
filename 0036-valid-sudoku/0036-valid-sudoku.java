class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check row
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char item = board[i][j];
                if (item != '.' && !set.add(item))
                    return false;
            }
        }

        // check col
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char item = board[j][i];
                if (item != '.' && !set.add(item))
                    return false;
            }
        }

        // check subgrid
        int[][] startGrid = { { 0, 0 }, { 0, 3 }, { 0, 6 }, { 3, 0 }, { 3, 3 }, { 3, 6 }, { 6, 0 }, { 6, 3 },
                { 6, 6 } };
        for (int[] start : startGrid) {
            Set<Character> set = new HashSet<>();
            for (int row = start[0]; row < start[0] + 3; row++) {
                for (int col = start[1]; col < start[1] + 3; col++) {
                    char item = board[row][col];
                    if (item != '.' && !set.add(item)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}