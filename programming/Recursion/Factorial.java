package programming.Recursion;

public class Factorial {
	public static void main(String[] args) {
		long fact = factorial(20);
		System.out.println(fact);
	}
	public static long factorial(long n){
		if(n==1){
			return 1;
		}
		return n * factorial(n-1);
	}
}
