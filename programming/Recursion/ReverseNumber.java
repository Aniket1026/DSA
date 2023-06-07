package programming.Recursion;

public class ReverseNumber {
	public static void main(String[] args) {
		int n = 1324;
		int reverse = digit(n);
		System.out.println(reverse);
	}
	public static int reverseNum(int n, int digit){
		if(n%10==n){
			return n;
		}
		return (n%10) * (int)Math.pow(10,digit-1) + reverseNum(n/10, digit-1);
	}

	public static int digit(int n){
		int count =0;
		int num =n;
		while(num>0){
			count++;
			num=num/10;
		}
		return reverseNum(n,count);
	}
}
