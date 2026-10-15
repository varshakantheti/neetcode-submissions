class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length -1;
        int lmax = 0;
        int rmax = 0;
        int total = 0;
        while(l<=r){
            int temp;
            if(lmax <= rmax){
                temp = lmax - height[l];
                if(!(temp <= 0)){
                    total += temp;
                }
                lmax = Math.max(height[l], lmax);
                l++;
            } else {
                temp = rmax - height[r];
                if(!(temp <= 0)){
                    total += temp;
                }
                rmax = Math.max(height[r], rmax);
                r--;
            }
        }
        return total;
    }
}
