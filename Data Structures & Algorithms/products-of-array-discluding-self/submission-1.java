class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        for(int i = 0; i<=nums.length-1; i++){
            ret[i]=prefix;
            prefix = prefix * nums[i];
        }
        for(int i = nums.length-1; i>=0; i--){
            ret[i]=ret[i] * postfix;
            postfix = postfix * nums[i];
        }
        return ret;
    }
    //1 1 2 8
    //48 24 6 1
}  
