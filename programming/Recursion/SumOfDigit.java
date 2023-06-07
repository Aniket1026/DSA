package programming.Recursion;

public class SumOfDigit {
	public static void main(String[] args) {
		int sum = sumOfDigit(1234);
		System.out.println(sum);
	}
	public static int sumOfDigit(int n){
		if(n==0){
			return 0;
		}
		return sumOfDigit(n/10) + n%10;
	}
}
