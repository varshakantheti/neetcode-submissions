class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==1){
            return 1;
        }
        int longest = 0;
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> myMap = new HashMap<>();
        while(r<=s.length()-1){
            if(myMap.containsKey(s.charAt(r))){
                myMap.put(s.charAt(r), myMap.get(s.charAt(r))+1);
            } else {
                myMap.put(s.charAt(r), 1);
            }
            maxFreq = Math.max(maxFreq, myMap.get(s.charAt(r)));
            if (r-l+1-maxFreq <= k){
                longest = Math.max(longest, r-l+1);
                r++;
            } else {
                myMap.put(s.charAt(l), myMap.get(s.charAt(l))-1);
                l++;
                r++;
            }
        }
        return longest;
    }
}
