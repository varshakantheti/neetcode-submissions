class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> myList = new ArrayList<>();
        for(int i = 0; i<=nums.length-3; i++){
            if(i!=0){
                while(i<nums.length-2 && nums[i]==nums[i-1]){
                    i++;
                }
            }
            int l = i +1;
            int r = nums.length -1;
            int temp = -1*(nums[r]+nums[l]);
            while(l<r){
                if (nums[i]>temp){
                    r--;
                    while(r> l && nums[r]==nums[r+1] ){
                        r--;
                    }
                    temp = -1*(nums[r]+nums[l]);
                }
                else if (nums[i]<temp){
                    l++;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    temp = -1*(nums[r]+nums[l]);
                }
                else if(nums[i]==(temp)){
                    myList.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    r--;
                    l++;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(r> l && nums[r]==nums[r+1] ){
                        r--;
                    }
                    temp = -1*(nums[r]+nums[l]);
                } 
            }
        }
        return myList;
    }
}
