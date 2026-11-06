class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        } 
        int[] sa = new int[26];
        int[] ta = new int[26];
        for(char c : s.toCharArray()){
            sa[c-'a']++;
        }
        for(char c : t.toCharArray()){
            ta[c-'a']++;
        }
        return Arrays.equals(ta, sa);
    }
}
