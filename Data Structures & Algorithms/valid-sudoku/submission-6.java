class Solution {
    public boolean isValidSudoku(char[][] board) {
        // (4, 1) => what's the start of this square? Which square does this belong to?
        // (3, 0) => (take any x, y / 3), discard remainder * 3

        // go through the diag and check rows + cols
        for (int i = 0; i < board.length; i++) {
            Set<Integer> rowNums = new HashSet<>();
            Set<Integer> colNums = new HashSet<>();

            for (int j = 0; j < board.length; j++) {
                int offset = (i + j) % board.length;

                int currNum = board[i][offset] - '0';
                if (rowNums.contains(currNum) && currNum >= 0) {
                    return false;
                }
                rowNums.add(currNum);

                currNum = board[offset][i] - '0';
                if (colNums.contains(currNum) && currNum >= 0) {
                    return false;
                }
                colNums.add(currNum);
            }
        }

        // check each 3x3 square
        for (int row = 0; row < board.length; row += 3) {
            for (int col = 0; col < board[0].length; col += 3) {
                Set<Integer> count = new HashSet<>();

                for (int sRow = 0; sRow < 3; sRow++) {
                    for (int sCol = 0; sCol < 3; sCol++) {
                        int currNum = board[row + sRow][col + sCol] - '0';
                        if (count.contains(currNum) && currNum >= 0) {
                            return false;
                        }
                        count.add(currNum);
                    }
                }
            }
        }

        return true;
    }
}
