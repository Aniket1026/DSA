package programming.Backtracking;

public class NQueens {
	public static void main(String[] args) {
		boolean[][] board = new boolean[5][5];
		System.out.println(placeQueens(board,0));
	}
	public static int placeQueens(boolean[][] board, int row){
		if(row== board.length){
			display(board);
			System.out.println();
			return 1;
		}

		int count=0;
		// place the queen in every row
		for(int col=0;col<board.length;col++){
			// but place the queen only if it is safe
			if(isSafe(board,row,col)){
				board[row][col]=true;
				count = count + placeQueens(board,row+1);
				board[row][col]=false;
			}
		}
		return count;
	}
	public static void display(boolean[][] board) {
		for(boolean[] row:board){
			for(boolean element:row){
				if(element)
					System.out.print("Q");
			    else{
			 	    System.out.print("X");
			    }
			}
			System.out.println();
		}
	}

	public static boolean isSafe(boolean[][] board, int row, int col) {
		// check if any queen exists in the same column
		for(int i=0;i<=row;i++){
			if(board[row-i][col])
				return false;
		}

		// check for left upper diagonal
		int leftPart = Math.min(row,col);
		for(int i =1;i<=leftPart;i++){
			if(board[row-i][col-i])
				return false;
		}

		// check for right upper diagonal
		int rightPart = Math.min(row, board.length-1-col);
		for(int i=1;i<=rightPart;i++){
			if(board[row-i][col+i])
				return false;
		}
		return true;
	}
}

