class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, profit =0;
        for(int cost : prices){
            buy = Math.min(cost, buy);
            profit = Math.max(profit, cost-buy);
        }
        return profit;
    }
}