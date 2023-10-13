package programming.Graph;
// Link -> https://leetcode.com/problems/flood-fill/description/
// problem:
//         Flood fill the array which says that given the initial row ,col and color
//         fill all the 4 direction of the initial row and col with new color
//         also the all 4 direction from these colored direction to there 4 directions having same initial color with new newColor given as color.
public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if(image[sr][sc] == color) return image;
		int initColor = image[sr][sc];
		int row = image.length;
		int col = image[0].length;
		int[][] ff = new int[row][col];

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				ff[i][j] = image[i][j];
			}
		}
		flooding(sr,sc,initColor,ff,color);
		return ff;
	}
	public void flooding(int row,int col,int initColor,int[][] ff, int newColor){
		if(row <0 || row>=ff.length || col <0 || col >= ff[0].length) return;
		if(ff[row][col] == newColor || ff[row][col] != initColor) return;
		ff[row][col] = newColor;
		flooding(row-1,col,initColor,ff,newColor);
		flooding(row,col+1,initColor,ff,newColor);
		flooding(row+1,col,initColor,ff,newColor);
		flooding(row,col-1,initColor,ff,newColor);
	}
}
