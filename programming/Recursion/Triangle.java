package programming.Recursion;

public class Triangle {
	public static void main(String[] args) {
       trianglePattern(4,0);
	}
	public static void trianglePattern(int row, int col){
		if(row==0){
			return ;
		}
		if(row > col){
			System.out.print("* ");
			trianglePattern(row,col+1);
		}else{
			System.out.println();
			trianglePattern(row-1,0);
		}
	}
}
