class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        for(int num : nums){
            if(mySet.contains(num)){
                return true;
            } else {
                mySet.add(num);
            }
        }
        return false;
    }
}