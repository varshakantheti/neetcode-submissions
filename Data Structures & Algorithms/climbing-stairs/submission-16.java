class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int one = 1;
        int two = 2;
        for(int i=3; i<=n; i++){
            int temp = two;
            two = one + two;
            one = temp;
        }
        return two;
    }
}
//1 1
//2 2
//3 3
//4 5
