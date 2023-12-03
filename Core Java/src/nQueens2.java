class nQueens2 {
    static int count = 0;

    public static boolean isSafe(char[][] board, int row, int col) {
        //top left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //top right
        for (int r = row, c = col; r >= 0 && c < board[0].length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //bottom left
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        //bottom right
        for (int r = row, c = col; r < board.length && c < board[0].length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //vertical line
        for (char[] chars : board) {
            if (chars[col] == 'Q') {
                return false;
            }
        }

        //horizontal line
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void helper(char[][] board, int col) {
        if (col == board[0].length) {
            count++;
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static int totalNQueens(int n) {
        char[][] board = new char[n][n];
        helper(board, 0);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(totalNQueens(1));
    }
}