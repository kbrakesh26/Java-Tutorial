public class nQueen{
    public static void main(String[] args) {
        int n=5;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
            nqueen(board,0);
    }
    private static void nqueen(char[][] board, int row){
        int n=board.length;
        if(row==n){   //base case
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++){   //work n call
           if(isSafe(board,row,j)) {
            board[row][j]='Q';
            nqueen(board,row+1);
            board[row][j]='.'; //backTracking
           }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col){
        int n=board.length;
        //check the row
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        //check the column
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        //check northEast
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //check southEast
         i=row;
         j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        //check southWest
         i=row;
         j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        //check northWest
         i=row;
         j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;

    }
     
}