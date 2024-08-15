class Solution {
    public int pathSum(int i, int j, int[][] grid, int[][] dp){
        int n = grid.length;
        int m = grid[0].length;
        if(i==n-1 && j==m-1){
            return grid[n-1][m-1];
        }
        if(i>=n || j>=m){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1) return dp[i][j];
        
        int right = pathSum(i, j+1, grid, dp);
        int left = pathSum(i+1, j, grid, dp);
        
        return dp[i][j] = grid[i][j] + Math.min(left, right);
    }
    
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] dp = new int[n][m];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        
        return pathSum(0, 0, grid, dp);
    }
}