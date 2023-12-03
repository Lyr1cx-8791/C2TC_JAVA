import java.util.*;
public class nQueens {
    boolean isSafe(int row, int col, char[][] board){
        //horizontal line
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }
        //vertical line
        for (char[] chars : board) {
            if (chars[col] == 'Q') {
                return false;
            }
        }
        //upper left
        for(int r = row, c = col; c >= 0 && r >= 0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
        for(int r = row, c = col; c < board.length && r >= 0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //bottom left
        for(int r = row, c = col; r < board.length && c >= 0; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //bottom right
        for(int r = row, c = col; r < board.length && c < board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    void helper(char[][] board, List<List<String>> allBoards,int col){
        if(col == board.length){
            saveBoards(board, allBoards);
        }
        for(int row = 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    void saveBoards(char[][] board,List<List<String>> allBoards){
        StringBuilder sb;
        ArrayList<String> newList = new ArrayList<>();
        for (char[] chars : board) {
            sb = new StringBuilder();
            for (int col = 0; col < board.length; col++) {
                if (chars[col] == 'Q') {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            newList.add(sb.toString());
        }
        allBoards.add(newList);
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> allBoards = new ArrayList<>();
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        nQueens q = new nQueens();
        System.out.println(q.solveNQueens(4));
    }
}