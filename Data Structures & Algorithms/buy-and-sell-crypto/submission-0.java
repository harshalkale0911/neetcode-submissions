class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int max_profit = 0;

        for(int i=1; i <prices.length ; i++){
            minPrice = Math.min(minPrice, prices[i]);

            int maxProfit = prices[i] - minPrice;

            max_profit = Math.max(maxProfit, max_profit);
        }
        return max_profit;
    }
}
