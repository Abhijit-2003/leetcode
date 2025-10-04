class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];

        for(int price : prices) {
            int profit = price - buy;

            maxProfit = Math.max(profit, maxProfit);

            if(buy > price) {
                buy = price;
            }
        }

        return maxProfit;
    }
}