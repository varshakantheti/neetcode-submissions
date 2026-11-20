class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        int l = 0;
        int r = 0;
        int ret = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i= 0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(!map.containsKey(temp) || (map.containsKey(temp) && map.get(temp)<l)){
                map.put(temp,i);
                ret = Math.max(ret, r-l+1);
                r++;
            } else{
                l=map.get(temp)+1;
                map.put(temp,i);
                r++;
            } 
        }
        return ret;
    }
}
