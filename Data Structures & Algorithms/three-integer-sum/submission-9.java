class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0; i<=nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int temp = nums[l]+nums[r]+nums[i];
                if(temp==0){
                    ret.add(Arrays.asList(nums[i],nums[l], nums[r]));
                    r--;
                    l++;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                } else if (temp<0){
                    l++;
                } else if (temp>0) {
                    r--;
                }
            }
        }
        return ret;
    }
}
