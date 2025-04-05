class Solution {
    public int maxProfit(int[] prices) {
        int start=0, maxProfit=0;
        for(int end=1; end<prices.length; end++){
            if(prices[start]>prices[end]){
                start=end;
            } else {
                maxProfit = Math.max(maxProfit, prices[end]-prices[start]);
            }
        }
        return maxProfit;
    }
}