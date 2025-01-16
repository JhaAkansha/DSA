/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    1. Each row must contain the digits 1-9 without repetition.
    2. Each column must contain the digits 1-9 without repetition.
    3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
*/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set visited = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!visited.add(b+i) || !visited.add(j+b) || !visited.add(i/3 + b + j/3))
                    return false;
                }
            }
        }
        return true;
    }
}
