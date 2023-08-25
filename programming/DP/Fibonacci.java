package programming.DP;

public class Fibonacci {

	// memoization, sc->O(n) , tc->O(n)(extra space)+ O(n)(stack space)
//	public static void main(String[] args) {
//		int n = 7;
//		int[] dp = new int[n+1];
//		System.out.println(fibonacci(n,dp));
//	}
//	public static int fibonacci(int n,int[] dp){
//		if(n<=1){
//			return n;
//		}
//		if(dp[n]!=0) return dp[n];
//		dp[n]= fibonacci(n-1,dp)+fibonacci(n-2,dp);
//		return dp[n];
//	}

	// tabulation, sc->O(n) no extra stack memory, tc->O(n)
//	public static void main(String[] args) {
//		int n = 6;
//		int[] dp = new int[n+1];
//		dp[0]=0;
//		dp[1]=1;
//
//		for(int i=2;i<=n;i++){
//			dp[i]=dp[i-1]+dp[i-2];
//		}
//		System.out.println(dp[n]);
//	}

	// extra optimized , sc->O(1), tc->O(n)
	public static void main(String[] args) {
		int n = 7;
		int prev2=0;
		int prev=1;
		for(int i=0;i<n-1;i++){
			int curr = prev+prev2;
			prev2=prev;
			prev=curr;
		}
		System.out.println(prev);
	}
}
