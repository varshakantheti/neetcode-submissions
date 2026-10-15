class Solution {
    public int climbStairs(int n) {
        if(n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else if (n==2){
            return 2;
        }
        int l = 1;
        int r = 2;
        int total = 0;
        for(int i=3; i<=n; i++){
            total = l + r;
            l = r;
            r = total;
        }
        return total;
    }
}
