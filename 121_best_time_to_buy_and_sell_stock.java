class Solution {
    public int maxProfit(int[] prices) {
        
        int maxprofit = 0;
        int minprice = prices[0];

       for(int i=1;i<prices.length;i++){

        int diff = prices[i]-minprice;
        maxprofit = Math.max(maxprofit, diff);
        minprice = Math.min(minprice, prices[i]);
       }

       return maxprofit;
    }
}