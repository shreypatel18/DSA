public class NQueens {
    static Boolean isSafe(int[][] board, int x, int y){
        int i,j;
        Boolean flag = true;
        //checking only on left
        for(j=0; j<y; j++){
            if(board[x][j]==1){
                flag = false;
            }
        }
        for( i = x , j =y; i>=0&&j>=0; i--,j--){
            if(board[i][j]==1){
                flag = false;
            }
        }
        for (i = x, j=y ; i<board.length&&j>=0; i++, j--){
            if(board[i][j]==1){
                flag = false;
            }
        }
        return flag;
    }
    static void print(int[][] board){
     for(int[] x : board){
         for(int y : x){
             System.out.print(" "+y+" ");
         }
         System.out.println();
     }
    }
    static Boolean sol(int[][] board, int column){
        if(column==board.length){
            return true;
        }

        for(int i = 0; i<board.length; i++){
            if(isSafe(board, i, column)){
                board[i][column]=1;
                if(sol(board, column+1)==true){
                    System.out.println("y");
                    return true;
                }
            }

            board[i][column]= 0;
        }
        return false;
    }

}
