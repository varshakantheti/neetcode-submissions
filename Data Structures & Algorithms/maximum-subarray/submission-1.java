class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max = nums[0];
        int count = nums[0];
        for(int r = 1; r<nums.length; r++){
            if(count<0){
                count = 0;
            }
            count += nums[r];
            max = Math.max(max, count);
        }
        return max;
    }
}
// -2 -3 -4
