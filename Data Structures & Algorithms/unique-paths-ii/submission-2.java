class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int[][] dp = new int[n][m];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return count(n-1, m-1, obstacleGrid, dp);
    }

    public int count(int i, int j, int[][] grid, int[][] dp){
        if(i < 0 || j < 0) return 0;

        // 🔥 move this before base case
        if(grid[i][j] == 1) return 0;

        if(i == 0 && j == 0) return 1;

        if(dp[i][j] != -1) return dp[i][j];

        int up = count(i-1, j, grid, dp);
        int left = count(i, j-1, grid, dp);

        return dp[i][j] = up + left;
    }
}