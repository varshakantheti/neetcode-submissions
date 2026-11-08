class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int ret = 0;
        int buy = 0;
        int sell = 1;
        while(sell<= prices.length-1){
            if(prices[buy]<prices[sell]){
                ret = Math.max(prices[sell] - prices[buy], ret);
                sell++;
            } else{
                buy = sell;
                sell = buy + 1;
            }
        }
        return ret;

    }
}
