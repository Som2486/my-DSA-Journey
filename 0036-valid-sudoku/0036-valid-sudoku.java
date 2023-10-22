class Solution {
    char[][] board;
    public boolean isValidSudoku(char[][] board) {
        this.board = board;
        int n = board.length;
        
        for(int i = 0; i < n; i++){
            if(!checkIfValid(i, 0, i, n - 1)) return false;
            if(!checkIfValid(0, i, n - 1, i)) return false;
        }
        
        for(int startRow = 0; startRow < n; startRow += 3){
            for(int startCol = 0; startCol < n; startCol += 3){
                if(!checkIfValid(startRow, startCol, startRow + 2, startCol + 2)) return false;
            }   
        }
        
        return true;
    }
    
    private boolean checkIfValid(int startRow, int startCol, int endRow, int endCol){
        int[] check = new int[9];
        for(int i = startRow; i <= endRow; i++){
            for(int j = startCol; j <= endCol; j++){
                char c = board[i][j];
                if(c != '.'){
                    if(check[c - '1'] >= 1) return false;
                    check[c - '1']++;
                }
            }
        }
        return true;
    }
}