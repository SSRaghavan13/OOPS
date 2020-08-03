package MostFrequent;

public class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int[][] dirs = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int live = 0;
                for (int[] dir : dirs) {
                    int nextX = dir[0] + i;
                    int nextY = dir[1] + j;
                    if (nextX >= 0 && nextX < board.length && nextY >= 0 && nextY < board[0].length
                            && Math.abs(board[nextX][nextY]) == 1) {
                        live++;
                    }
                }
                if (board[i][j] == 1 && (live < 2 || live > 3))
                    board[i][j] = -1;
                if (board[i][j] == 0 && live == 3)
                    board[i][j] = 2;
            }
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == -1)
                    board[i][j] = 0;
                else if (board[i][j] == 2)
                    board[i][j] = 1;
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = { { 0, 1, 0 },
                          { 0, 0, 1 },
                          { 1, 1, 1 },
                          { 0, 0, 0 } };
        gameOfLife(board);
        for(int[] row : board) {
            for(int item : row)
                System.out.print(item);
            System.out.println();
        }
    }
}