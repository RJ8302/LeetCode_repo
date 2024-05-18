class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max = 0;
       while(right <prices.length){
            if(prices[left] > prices[right]){
                left = right;
            }else{
                int currProfit = prices[right] - prices[left];
                if(currProfit > max){
                    max = currProfit;
                }
            }
            right++;
        }
        return max;
    }
}