class Solution {
    public static int projectionArea(int[][] grid) {
        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            int maxInRow = 0;
            int maxInCol = 0;

            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) sum++;
                maxInRow = Math.max(grid[i][j], maxInRow);
                maxInCol = Math.max(grid[j][i], maxInCol);
            }
            sum += maxInRow + maxInCol;
        }
        return sum;
    }
}
