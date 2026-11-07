class Solution {
    public int maxArea(int[] heights) {
        int ret = Integer.MIN_VALUE;
        int l = 0;
        int r = heights.length-1;
        while(l<r){
            int temp = Math.min(heights[l], heights[r])*(r-l);
            ret = Math.max(ret, temp);
            if(heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return ret;
    }
}
