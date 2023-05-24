package programming.BitManipulation;
/*
Find the nth bit of a number

6 - > 110 here
1st bit -> 0
2nd bit -> 1
3rd bit -> 1

Approach : Take the & of that bit with 1; for 3rd bit of number starting from right hand side
take & with the 3rd bit

1 0 0 1 1 0
0 0 0 1 0 0
-----------
0 0 0 1 0 0 -> This result will help in determining the nth bit is 0 or 1
If result contains all 0 then the nth bit was if the result is 2^n-1 then the nth bit is 1

Conclusion : Any bit of a number can be determined by doing the & operation with 1 of the number


 */
public class FindBit {
	public static void main(String[] args) {
		int n = 372;
		int k = 5;
		System.out.println(findBit(n,k));
	}

	private static int findBit(int n, int k) {
		int mask = 1;
		mask = mask<<k-1;

		if((n&mask)==Math.pow(2,k-1)){
			return 1;
		}
		return 0;
	}
}
