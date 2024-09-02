/* Print one SOLUTION */
public class N_Queens {
    
    public static void printboard(char board[][])
    {
        System.out.println("<--------CHESS BOARD-------->");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean nqueens(char board[][], int row)
    {
        //base                                                  
        if(row==board.length)
        {
            count++;
            return true;
        }
        //column loop
        for(int j =0; j<board.length;j++)
        {
            if(issafe(board,row,j))
            {
                board[row][j]='Q';
                if(nqueens(board, row+1))
                {
                    return true;
                }  //function call
                board[row][j]='X';      //Backtracking step
            }

    }
    return false;

    }
    public static boolean issafe(char board[][], int row, int col)
    {
       
        //vertical loop
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1, j=col-1; i>=0&&j>=0; i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }

                
        }
        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
    
        return true;
    }
    static int count =0;

    public static void main(String[] args) {
        int n=4;
        char board[][] = new char [n][n];
        //INITIALIZING
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='X';
            }
        }
        

        if(nqueens(board, 0))
        {
            System.out.println("Solution is possible");
            printboard(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
    }
}
