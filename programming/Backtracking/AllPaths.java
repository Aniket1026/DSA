package programming.Backtracking;

public class AllPaths {
	public static void main(String[] args) {
		boolean[][] board = {{true,true,true},{true,true,true},{true,true,true}};
         allPaths(0,0,board,"");
	}
	public static void allPaths(int row ,int col,boolean[][] maze, String str ){
		if(row == maze.length-1 && col == maze[0].length-1){
			System.out.println(str);
			return;
		}

		if(!maze[row][col]){
			return;
		}
		maze[row][col]= false;
		if(row>0){
			allPaths(row-1,col,maze,str+'U');
		}
		if(col<maze[0].length-1){
			allPaths(row,col+1,maze,str+'R');
		}
		if(row< maze.length-1){
			allPaths(row+1,col,maze,str+'D');
		}
		if(col>0){
			allPaths(row,col-1,maze,str+'L');
		}
		maze[row][col]= true;
	}
}
