package programming.DP;

public class PathCount {
	public static void main(String[] args) {
		int n =5;
		System.out.println(pathCounts(n));

	}
	// pathcounts using lists of list
//	public static List<List<String>> pathCounts(int n){
//		if(n<=0){
//			List<List<String>> ls2 = new ArrayList<>();
//			if(n==0){
//				ls2.add(new ArrayList<>());
//			}
//			return ls2;
//		}
//	    List<List<String>> path1 = pathCounts(n-1);
//		List<List<String>> path2 = pathCounts(n-2);
//		List<List<String>> ans = new ArrayList<>();
//
//		for(List<String> p1 : path1){
//			List<String> updatedList = new ArrayList<>(p1);
//			updatedList.add(0,"1");
//			ans.add(updatedList);
//		}
//		for(List<String> p2 : path2){
//			List<String> updatedList = new ArrayList<>(p2);
//			updatedList.add(0,"2");
//			ans.add(updatedList);
//		}
//       return ans;
//	}

	// recursive approach
	public static int pathCounts(int n){
		if(n==2) return 2;
		if(n==1) return 1;

		return pathCounts(n-1)+pathCounts(n-2);
	}

	// memoization , sc->O(n)stack+O(n)auxiliary , tc->O(n)
	public int countWays(int n , int[] dp){
		if(n==2 || n==1) return n;
		if(dp[n]!=0) return dp[n];
		return dp[n] = countWays(n-1,dp)+countWays(n-2,dp);
	}
	// tabulation sc->O(n)auxiliary , tc->O(n)
//	public int climbStairs(int n) {
//		if(n<2) return n;
//		int[] dp = new int[n+1];
//		dp[1]=1;
//		dp[2]=2;
//
//		for(int i=3;i<=n;i++){
//			dp[i]=dp[i-1]+dp[i-2];
//		}
//		return dp[n];
//	}

	// extra space optimized sc->O(1), tc->O(n)
	public int climbStairs(int n) {
		if(n<=2) return n;
		int prev =2;
		int prev2 =1;
		for(int i=3;i<=n;i++){
			int curr = prev+prev2;
			prev2=prev;
			prev=curr;
		}
		return prev;
	}
}
