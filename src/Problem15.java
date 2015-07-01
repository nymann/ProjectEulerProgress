/**
 * Created by NEXDESK on 01-07-2015.
 */
public class Problem15 {
    long grid[][];

    public Problem15(int sizeOfGrid) {
        grid = new long[sizeOfGrid + 1][sizeOfGrid + 1];
        grid[sizeOfGrid - 1][sizeOfGrid - 1] = 0;
        fillLastRow();
        fillLastCol();
        calculateNext();
    }

    void fillLastRow() {
        for (int i = 0; i < (grid.length - 1); i++) {
            grid[i][grid.length - 1] = 1;
        }
    }
    
    void fillLastCol() {
        for (int i = 0; i < (grid.length - 1); i++) {
            grid[grid.length - 1][i] = 1;
        }
    }

    void calculateNext() {

        for (int row = grid.length - 2; row >= 0 ; row--) {
            for (int col = grid.length - 2; col >= 0 ; col--) {
                if ((grid[row + 1][col] != 0) && (grid[row][col + 1] != 0)) {
                    grid[row][col] = (grid[row + 1][col]) + (grid[row][col + 1]);
                }
            }
        }

        System.out.println(grid[0][0]);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Problem15(20);
        System.out.println("Solved in " + (System.currentTimeMillis()-start) + " ms.");
    }
}
