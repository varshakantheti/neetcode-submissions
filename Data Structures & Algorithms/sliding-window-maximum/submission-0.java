class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ret = new int[nums.length+1-k];
        Deque<Integer> d = new LinkedList<>();
        int maxx = nums.length-1;
        int r = 0;
        int l = 0;
        while(r<=maxx){
            while(!d.isEmpty() && l>d.peekFirst()){
                d.pollFirst();
            }
            while(r<k || r-l+1<=k){
                while(!d.isEmpty() && nums[r]>nums[d.peekLast()]){
                    d.pollLast();
                }
                d.offerLast(r);
                r++;
            }
            ret[l]=nums[d.peekFirst()];
            l++;
        }
        return ret;
    }
}
