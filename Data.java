public class Data {
    public static final int MAX = /* value not shown */;
    private int[][] grid;


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
                double generate = (int) (Math.random() * MAX) + 1;
                while (generate % 10 != 0 && generate % 100 == 0) {
                    generate = (int) (Math.random() * MAX) + 1;
                }
                grid[r][c] = (int) generate;
            }
        }
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
    }


    // There may be instance variables, constructors
    //and methods that are not shown.
}

}
