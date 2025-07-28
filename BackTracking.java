
import java.util.ArrayList;
import java.util.List;

public class BackTracking { // find all the sol and use the one u want

    public static void permutation(String str, int idx, String ps) {
        if (str.length() == 0) {
            System.out.println(ps);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curchar = str.charAt(i);
            String ns = str.substring(0, i) + str.substring(i + 1);
            permutation(ns, idx + 1, ps + curchar);
        }
    }

    // N-queens O(n to the power n)

    public static boolean isSafe(int row, int col, char Board[][]) {
        for (int j = 0; j < Board.length; j++) {
            if (Board[row][j] == 'Q') {
                return false;
            }
        }
        for (int i = 0; i < Board.length; i++) {
            if (Board[i][col] == 'Q') {
                return false;
            }
        }

        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (Board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        for (int c = col; c < Board.length && r >= 0; c++, r--) {
            if (Board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        for (int c = col; c >= 0 && r < Board.length; c--, r++) {
            if (Board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        for (int c = col; c < Board.length && r < Board.length; c++, r++) {
            if (Board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void saveBoard(char board[][], List<List<String>> allBoards) {
        String row = "";
        List<String> newboard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newboard.add(row);
        }
        allBoards.add(newboard);
    }

    public static void helper(char board[][], List<List<String>> allBoards, int col) {

        if (col == board.length) {
            new BackTracking().saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> SolverQueen(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        permutation("str", 0, "");
    }
}
