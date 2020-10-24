/* *****************************************************************************
 *  Takes three integer command-line arguments m, n, and k and prints an
 *  m-by-n grid of cells with k mines, using asterisks for mines and integers
 *  for the neighboring mine counts (with two space characters between each
 *  cell).
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        // m-by-n grid
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        // Number of mines
        int k = Integer.parseInt(args[2]);

        // Boolean 2D array to specify which cells contain mines
        boolean[][] hasMines = new boolean[m][n];
        // Integer 2D array to count the number of neighboring mines
        int[][] countMines = new int[m + 2][n + 2];

        // Place k mines uniformly at random among the mn cells
        while (k > 0) {
            int x = (int) (Math.random() * m);
            int y = (int) (Math.random() * n);
            if (!hasMines[x][y]) {
                hasMines[x][y] = true;
                k--;
            }
        }

        // Count the number of neighboring mines
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (hasMines[i - 1][j - 1]) {
                    /* Set cells with mines equal to 9. This is a placeholder
                    so it can be printed as an "*" later. This works since
                    cells with no mines can only have a maximum of 8
                    neighboring mines. */
                    countMines[i][j] = 9;
                    // Increment the 8 neighboring cells
                    countMines[i - 1][j - 1]++;
                    countMines[i - 1][j]++;
                    countMines[i - 1][j + 1]++;
                    countMines[i][j - 1]++;
                    countMines[i][j + 1]++;
                    countMines[i + 1][j - 1]++;
                    countMines[i + 1][j]++;
                    countMines[i + 1][j + 1]++;
                }
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (countMines[i][j] >= 9) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print(countMines[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
