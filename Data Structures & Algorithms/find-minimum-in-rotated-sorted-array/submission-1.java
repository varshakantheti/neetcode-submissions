class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int min = 1000;
        while(!(l>r)){
            int mid = (r + l)/2;
            min = Math.min(min, nums[mid]);
            if(nums[mid] > nums[r]){
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }
        return min;
    }
}
