package programming.Recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int val = fibbo(n);
		System.out.println(val);
	}
	public static int fibbo(int n){
		if(n==0 || n==1){
			return n;
		}
		int ans = fibbo(n-1) + fibbo(n-2);
		return ans;
	}
}
