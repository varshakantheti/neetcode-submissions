class Solution {
    public String reorganizeString(String s) {
        if(s.length()==1){
            return s;
        }
        int max = -1;
        int[] counts = new int[26];
        for(char c : s.toCharArray()){
            counts[c-'a']++;
            if(max==-1 || counts[max]<counts[c-'a']){
                max = c-'a';
            }
        }
        if(counts[max]>((s.length()+1)/2)){
            return "";
        }
        char[] ret = new char[s.length()];
        int cur = 0;
        while(counts[max]>0){
            ret[cur] = (char)(max + 'a');
            counts[max]--;
            cur+=2;
        }
        for(int c = 0; c<counts.length; c++){
            while(counts[c]>0){
                if(cur>=s.length()){
                    cur = 1;
                }
                ret[cur]= (char)(c + 'a');
                counts[c]--;
                cur +=2;
            }
        }
        return new String(ret);
    }
}