class Solution {
    public String reorganizeString(String s) {
        int[] counts = new int[26];
        int max = 0;
        for(char c : s.toCharArray()){
            counts[c-'a']++;
            if(counts[c-'a']>counts[max]){
                max = c-'a';
            }
        }
        if(counts[max]>(s.length()+1)/2){
            return "";
        }
        char[] ret = new char[s.length()];
        int index = 0;
        while(counts[max]>0){
            ret[index] = (char) (max + 'a');
            index +=2;
            counts[max]--;
        }
        for(int i= 0; i<26; i++){
            if(counts[i]==0){
                continue;
            } else {
                while(counts[i]>0){
                    if(index>s.length()-1){
                        index = 1;
                    }
                    ret[index] = (char)(i + 'a');
                    counts[i]--;
                    index += 2;
                }
            }
        }
        return new String(ret);
    }
}