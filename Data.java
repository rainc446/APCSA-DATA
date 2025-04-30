public class Data {
    public static final int MAX = 250; /* value not shown */
    private int[][] grid;

    public Data (int r, int c) {
        grid = new int[r][c];
    }

    /**
     * Fills all elements of grid with randomly generated
     * values, as described in part (a)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public void repopulate() {
        /* to be implemented in part (a) */
        for (int r = 0; r < grid.length; r ++) {
            for (int c = 0; c < grid[0].length; c ++) {
                int generate = (int) (Math.random() * MAX) + 1;
                while (generate % 10 != 0 || generate % 100 == 0) {
                    generate = (int) (Math.random() * MAX) + 1;
                }
                grid[r][c] = generate;
            }
        }
    }

    public String toString() {
        String x = "";
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
               x += grid[r][c] + " ";
            }
            x += "\n";
        }
        return x;
    }

    /**
     * Returns the number of columns in
     * grid that are in increasing order, as
     * described in part (b)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public int countIncreasingCols() {
        /* to be implemented in part (b) */
        int count = 0;
        int max = 0;
        boolean ordered;
        for (int c = 0; c < grid[0].length; c ++) {
            ordered = true;
            max = 0;
            for (int r = 0; r < grid.length; r ++) {
                if (grid[r][c] >= max) {
                    max = grid[r][c];
                }
                else {
                    ordered = false;
                }
            }
            if (ordered) {
                count++;
            }
        }
        return count;
    }


    // There may be instance variables, constructors
    //and methods that are not shown.
}
