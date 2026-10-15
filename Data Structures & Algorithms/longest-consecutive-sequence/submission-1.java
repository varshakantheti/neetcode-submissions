class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> mySet = new HashSet<>();
        for(int num : nums){
            mySet.add(num);
        }
        int longest = 1;
        for(int num : nums){
            int length = 1;
            if(!mySet.contains(num-1)){
                while(mySet.contains(num+length)){
                    length ++;
                    longest = Math.max(longest, length);
                }
            }
        }



        return longest;
    }
}
