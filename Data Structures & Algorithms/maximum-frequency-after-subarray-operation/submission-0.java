class Solution {
    public int maxFrequency(int[] nums, int k) {
        // orignal k + (new - lost k)
        int original = 0;
        for(int num : nums){
            if(num==k){
                original++;
            }
        }
        int max = 0;
        for(int i=1; i<51;i++){
            if(i==k){
                continue;
            }
            int count = 0;
            for(int num : nums){
                if(count<0){
                    count = 0;
                }
                if(num==i){
                    count++;
                } else if(num==k){
                    count--;
                }
                max = Math.max(max, count);
            }
        }
        return original + max;
    }
}