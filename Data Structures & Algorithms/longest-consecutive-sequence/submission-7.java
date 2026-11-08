class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ret = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(set.contains(num-1)){
                continue;
            } else {
                int temp = num;
                int count = 1;
                while(set.contains(temp+1)){
                    temp ++;
                    count ++;
                }
                ret = Math.max(ret, count);
            }
        }
        return ret;
    }
}
