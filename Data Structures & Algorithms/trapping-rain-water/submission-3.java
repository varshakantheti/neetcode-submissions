class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lmax = height[l];
        int rmax = height[r];
        int ret = 0;
        while(l<r){
            if(lmax<=rmax){
                l++;
                if(height[l]<lmax){
                    ret += lmax - height[l];
                }
                lmax = Math.max(lmax, height[l]);
            } else {
                r--;
                if(height[r]<rmax){
                    ret += rmax - height[r];
                }
                rmax = Math.max(rmax, height[r]);
            }
        }
        return ret;
    }
}
