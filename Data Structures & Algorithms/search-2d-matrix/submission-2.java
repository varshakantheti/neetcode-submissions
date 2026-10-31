class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = (matrix.length-1)/2;
        int col = matrix[0].length-1;
        while(row>=0 && row<=matrix.length-1){
            if(matrix[row][col]>=target){
                if(matrix[row][0]<=target){
                    int l = 0;
                    int r = col;
                    int mid = 0;
                    while(l<=r){
                        mid = (l+r)/2;
                        if(matrix[row][mid]==target){
                            return true;
                        } else if(matrix[row][mid]>target){
                            r = mid-1;
                        } else {
                            l = mid+1;
                        }
                    }
                    return false;
                } else {
                    if(row!=0 && matrix[row-1][col]<target){
                        return false;
                    }
                    row--;
                }
            } else if(matrix[row][col]<target){
                row++;
            }
        }
        return false;
    }
}
