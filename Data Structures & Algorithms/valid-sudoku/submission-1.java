class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] row = new HashSet[9];
        HashSet<Integer>[] col = new HashSet[9];
        HashSet<Integer>[] box = new HashSet[9];
        for(int i=0; i<9; i++){
            row[i] = new HashSet<>(); 
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for(int i=0; i<9; i++){
            for(int j = 0; j<9; j++){
                int num = board[i][j];
                int temp = ((i/3)*3) + (j/3);
                if(num == '.'){
                    continue;
                }
                if(row[i].contains(num) || col[j].contains(num) || box[temp].contains(num)){
                    return false;
                }
                row[i].add(num);
                col[j].add(num);
                box[temp].add(num);
            }
        }
        return true;
    }
}
