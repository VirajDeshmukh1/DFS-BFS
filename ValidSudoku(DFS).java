class Solution {
    public boolean isValidSudoku(char[][] board) {
        //row
        for(int i=0;i<9;i++){
            boolean[] b = new boolean[9];
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(b[(int)(board[i][j] - '1')] == true ){
                        return false;
                    }else{
                        b[(int)(board[i][j]- '1')] = true;
                    }
                }
            }
        }
        
        //column
        for(int j=0;j<9;j++){
            boolean[] b = new boolean[9];
            for(int i=0;i<9;i++){
                if(board[i][j]!='.'){
                    if(b[(int)(board[i][j] - '1')] == true){
                        return false;
                    }else{
                        b[(int)(board[i][j] - '1')] = true;
                    }
                }
            }
        }
        
        //block
        for(int block=0; block<9;block++){
            boolean[] b = new boolean[9];
            for(int i = block/3*3; i < block/3*3+3; i++){
                for(int j = block%3*3; j < block%3*3+3; j++){
                    if(board[i][j]!='.'){
                        if(b[(int)(board[i][j] - '1')]==true){
                            return false;
                        }else{
                            b[(int)(board[i][j]- '1')] = true;
                        }   
                    }
                }
            }
        }
        return true;
    }
}