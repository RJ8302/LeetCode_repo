class Solution{
    public int sum(int i, int j, int[][]grid, int[][]dp) {
        int m = grid.length;
        int n = grid[0].length;
        
        if(i==m-1 && j==n-1){
            return grid[m-1][n-1];
        }
        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }        
        int right = sum(i, j+1, grid, dp);
        int down = sum(i+1, j, grid, dp);   
        
        return dp[i][j] = Math.min(right, down) + grid[i][j];
    }
    
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return sum(0, 0, grid, dp);
    }
}