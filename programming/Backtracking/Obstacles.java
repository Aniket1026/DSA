package programming.Backtracking;

public class Obstacles {

	public static void main(String[] args) {
        boolean[][] board = {{true,true,true},{true,false,true},{true,true,true}};
		pathWithoutObstacle(0,0,board,"");
	}

	public static void pathWithoutObstacle(int row, int col,boolean[][] maze,String str){
		if(row>maze.length-1 || col>maze[0].length-1){
		     return;
		}
		if(row==maze.length-1 && col==maze[0].length-1){
			System.out.println(str);
			return;
		}

		if(!maze[row][col]){
			return;
		}
		pathWithoutObstacle(row+1,col,maze,str+'D');
		pathWithoutObstacle(row,col+1,maze,str+'R');
	}
}
