class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int ret = 0;
        HashSet<Integer> mySet = new HashSet<>();
        for(int num : nums){
            if(!mySet.contains(num)){
                mySet.add(num);
            }
        }
        int length = 1;
        for(int num : mySet){
            if(!mySet.contains(num-1)){
                int temp = 1;
                while(mySet.contains(num+temp)){
                    length ++;
                    temp ++;
                }
                ret = Math.max(temp,ret);
            }
        }
        return ret;
    }
}
