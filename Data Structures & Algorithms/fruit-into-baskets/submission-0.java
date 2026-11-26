class Solution {
    public int totalFruit(int[] fruits) {
        // num, index, count
        int[] one = new int[]{-1,-1,0};
        int[] two = new int[]{-1,-1,0};
        int l = 0;
        int max = 0;
        int count = 0;
        for(int r=0; r<fruits.length;r++){
            if(one[1]==-1 && two[1]==-1){
                one = new int[]{fruits[r],r,1};
                count++;
            } else if(two[1]==-1 && fruits[r]!=one[0]){
                two = new int[]{fruits[r],r,1};
                count++;
            } else if(fruits[r]==one[0] || fruits[r]==two[0]){
                if(fruits[r]==one[0]){
                    one[1] = r;
                    one[2]++;
                    count++;
                }
                if(fruits[r]==two[0]){
                    two[1] = r;
                    two[2]++;
                    count++;
                }
            } else {
                max = Math.max(max, count);
                if(one[1]<=two[1]){
                    count -= (one[1]-l+1);
                    l = one[1]+1;
                    one = new int[]{fruits[r],r,1};
                    count+=1;
                } else {
                    count -= (two[1]-l+1);
                    l = two[1]+1;
                    two = new int[]{fruits[r],r,1};
                    count+=1;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}