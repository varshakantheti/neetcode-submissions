class Solution {
    public int longestConsecutive(int[] nums) {
        int ret = 0;
        HashSet<Integer> s = new HashSet<>();
        for(int num : nums){
            if(!s.contains(num)){
                s.add(num);
            }
        }
        for(int i : s){
            if(s.contains(i-1)){
                continue;
            }
            int temp = 1;
            int j = i;
            while(s.contains(j+1)){
                temp ++;
                j++;
            }
            ret = Math.max(ret, temp);
        }
        return ret;
    }
}
