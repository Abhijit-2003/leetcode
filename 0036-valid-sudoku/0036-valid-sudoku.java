class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] boxes = new int[9][9];

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                if(board[r][c] == '.') continue;

                int val = board[r][c] - '1';

                if(row[r][val] == 1) return false;

                row[r][val] = 1;

                if(col[c][val] == 1) return false;

                col[c][val] = 1;

                int boxIdx = 3 * (r / 3) + (c / 3);

                if(boxes[boxIdx][val] == 1) return false;

                boxes[boxIdx][val] = 1;
            }
        }

        return true;
    }
}