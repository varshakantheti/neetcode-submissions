class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        for(int r=1; r<nums.length; r++){
            while(l!=-1 && nums[r]<nums[l]){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l--;
                r--;
            }
            l=r;
        }
    }
}