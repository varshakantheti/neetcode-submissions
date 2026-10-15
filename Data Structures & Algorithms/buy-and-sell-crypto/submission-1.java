class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;
        int temp = r;
        while(l<prices.length-1){
            if (temp > r){
                temp = r;
            }
            while(temp<prices.length){
                maxProfit = Math.max(maxProfit, prices[temp]-prices[l]);
                temp ++;
            }
            l++;
            r++;
            temp++;
        }
        return maxProfit;
    }
}
