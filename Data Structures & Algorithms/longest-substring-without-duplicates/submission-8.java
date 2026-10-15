class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashMap<Character, Integer> myMap = new HashMap<>();
        int l = 0;
        int ret = 1;
        for(int r = 0; r<= s.length() -1; r++){
            if(myMap.containsKey(s.charAt(r))){
                l = Math.max(l, myMap.get(s.charAt(r))+ 1);
                myMap.put(s.charAt(r),r);
            } else {
                myMap.put(s.charAt(r),r);
            }
            ret = Math.max(ret, r-l+1);
        }
        return ret;
    }
}
