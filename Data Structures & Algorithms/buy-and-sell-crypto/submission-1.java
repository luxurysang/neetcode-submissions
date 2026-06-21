class Solution {
    public int maxProfit(int[] prices) {
         int result = 0;
         int l = 0;
         for (int r = 1; r < prices.length; r++) {
            if (prices[r] < prices[l]) {
                l = r;
            } else {
                int profit = prices[r] - prices[l];
                result = Math.max(result,profit);
            }
         }
         return result;
    }
}
