class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long l = 1;
        long r = 0;
        for(int count : piles){
            r = (long) Math.max(r, count);
        }
        long min = r;
        while(l<=r){
            long middle = l+ (r-l)/2;
            long hours = 0;
            for(int bananas : piles){
                hours += (long) bananas/middle;
                if(bananas % middle!=0){
                    hours++;
                }
            }
            if(hours<=h){
                min = middle;
                r = middle-1;
            } else if(hours>h){
                l = middle + 1;
            }
        }
        return (int) min;
    }
}
