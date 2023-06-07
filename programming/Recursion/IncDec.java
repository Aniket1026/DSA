package programming.Recursion;

public class IncDec {
	public static void main(String[] args) {
		num(5);
	}

	public static void num(int n){
		if(n==0){
			return;
		}

		System.out.print(n+ " ");
		num(n-1);
		System.out.print(n+ " ");
	}

}
