class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int shortest = 100001;
        String ret = "";
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0)+1);
        }
        int count = 0;
        int l = 0;
        for(int r=0; r<=s.length()-1; r++){
            if(!tMap.containsKey(s.charAt(r))){
                continue;
            }
            sMap.put(s.charAt(r), sMap.getOrDefault(s.charAt(r),0)+1);
            if(sMap.get(s.charAt(r)) <= tMap.get(s.charAt(r))){
                count ++;
            }
            while(count == t.length()){
                while(!tMap.containsKey(s.charAt(l)) ||
                    sMap.get(s.charAt(l)) > tMap.get(s.charAt(l))) {
                    if(tMap.containsKey(s.charAt(l))){
                        sMap.put(s.charAt(l), sMap.get(s.charAt(l))-1);
                    }
                    l++;
                }
                int temp = r - l +1;
                if(temp < shortest){
                    shortest = temp;
                    ret = s.substring(l,r+1);
                } 
                sMap.put(s.charAt(l),sMap.get(s.charAt(l))-1);
                if(sMap.get(s.charAt(l))< tMap.get(s.charAt(l))){
                    count--;
                }
                l++;
            }
        }
        return ret;
    }
}
