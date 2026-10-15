class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> myStack = new Stack<>();
        for(String s : tokens){
            if(s.equals("/")){
                int temp = myStack.pop();
                myStack.push(myStack.pop() / temp);
            } else if (s.equals("+")){
                myStack.push(myStack.pop() + myStack.pop());
            } else if (s.equals("-")){
                int temp = myStack.pop();
                myStack.push(myStack.pop() - temp);
            } else if (s.equals("*")){
                myStack.push(myStack.pop() * myStack.pop());
            } else {
                myStack.push(Integer.parseInt(s));
            }
        }
        return myStack.pop();
    }
}
