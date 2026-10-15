class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length -1;
        int maxW = 0;
        while(l<r){
            int temp = Math.min(heights[l], heights[r]) * (r-l);
            maxW = Math.max(maxW, temp);
            if(heights[l]<heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxW;
    }
}
