class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int max = prices[0];
        int min = prices[0];
        int profit = 0;
        
        for (int item : prices) {
            if (item < min) {
                max = item;
                min = item;
            } else if (item > max) {
                max = item;
                profit = Math.max(profit, max - min);
            }
        }
        
        return profit;
    }
}
