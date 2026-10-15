class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] ss1 = new int[26];
        int[] ss2 = new int[26];
        for(int i = 0; i<=s1.length()-1; i++){
            ss1[s1.charAt(i)-'a'] ++;
            ss2[s2.charAt(i)-'a'] ++;
        }
        int matches = 0;
        for(int i = 0; i<=ss1.length-1; i++){
            if(ss1[i]==ss2[i]){
                matches++;
            }
        }
        if(matches == 26){
            return true;
        } else {
            int l = 0;
            int r = l + s1.length() -1;
            matches = 0;
            while(r<s2.length()-1){
                ss2[s2.charAt(l)-'a'] -= 1;
                l++;
                r++;
                ss2[s2.charAt(r)-'a'] += 1;
                for(int i = 0; i<=ss1.length-1; i++){
                    if(ss1[i]==ss2[i]){
                        matches++;
                    }
                }
                if(matches == 26){
                    return true;
                }
                matches = 0;
            }
            
        }
        return false;
    }
}
