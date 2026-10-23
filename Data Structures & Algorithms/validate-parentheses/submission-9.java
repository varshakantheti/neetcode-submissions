class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '[' || c == '(' || c == '{'){
                myStack.push(c);
            } else{
                if(myStack.isEmpty()){
                    return false;
                }
                char temp = myStack.pop();
                if( (temp=='[' && c!=']') || (temp=='{' && c!='}') || (temp=='(' && c!=')') ){
                    return false;
                }
            }
        }
        if (myStack.isEmpty()){
            return true;
        }
         return false;
    }
}
