class Solution {
    public boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
        Stack<Character> tracker = new Stack<>();
        for(char c : s.toCharArray()){
            if (c=='(' || c=='{' || c=='['){
                tracker.push(c);
            }
            if(c==')' || c=='}' || c==']'){
                if(tracker.size()==0){
                    return false;
                }
                char temp = tracker.pop();
                if((c==')' && temp !='(') || (c==']' && temp !='[') || (c=='}' && temp !='{')){
                    return false;
                }
            }
        }
        if(tracker.size()!=0){
            return false;
        }
        return true;
    }
}
