class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxx = Integer.MIN_VALUE;
        int ret = maxx;
        for(int num : piles){
            if(num>maxx){
                maxx = num;
            }
        }
        int l=1;
        int r = maxx;
        while(l<=r){
            int mid = l + (r-l)/2;
            long total = 0;
            for(int num : piles){
                total += (num + mid -1) /mid;
            }
            if (total<=h){
                ret = mid;
                r = mid - 1;
            } else {
                l = mid +1;
            }
        }
        return ret;
    }
}
