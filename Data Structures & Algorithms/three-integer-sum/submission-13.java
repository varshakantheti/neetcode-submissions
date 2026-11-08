class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0; i<=nums.length-3; i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length -1;
            while(l<r){
                if(nums[l]+nums[r]+nums[i]>0){
                    r--;
                    while(r>=0 && nums[r]==nums[r+1]){
                        r--;
                    }
                } else if(nums[l]+nums[r]+nums[i]<0){
                    l++;
                    while(l<=nums.length-1 && nums[l]==nums[l-1]){
                        l++;
                    }
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    ret.add(temp);
                    r--;
                    while(r>=0 && nums[r]==nums[r+1]){
                        r--;
                    }
                    l++;
                    while(l<=nums.length-1 && nums[l]==nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return ret;
    }
}
