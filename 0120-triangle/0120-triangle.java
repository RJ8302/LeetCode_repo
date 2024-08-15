class Solution {
    public int minSum(List<List<Integer>> triangle, int n){
        int dp[][] = new int[n][n];
        for(int c=0; c<n ; c++){
            dp[n-1][c] = triangle.get(n-1).get(c);
        }
        
        for(int i=n-2; i>=0; i--){
            for(int j=i; j>=0; j--){
                int down = dp[i+1][j] + triangle.get(i).get(j);
                int downp = dp[i+1][j+1] + triangle.get(i).get(j);
                
                dp[i][j] = Math.min(down, downp);
            }
        }
             
        return dp[0][0];
    }
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        return minSum(triangle, n);
    }
}
