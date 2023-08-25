package programming.DP;

public class FrogJump {
	public static void main(String[] args) {

	}

	// +++++++++ tabulation sc->O(n),tc->O(n) ++++++++++++++++++

//	 public static int frogJump(int n, int heights[]) {
//	   int[]dp = new int[n];
//	   dp[1]=Math.abs(heights[1]-heights[0]);
//	   dp[2]=Math.abs(heights[2]-heights[0]);
//
//	   for(int i=3;i<n;i++){
//	       int f =Math.abs(heights[i]-heights[i-1]) +dp[i-1];
//	       int s = Math.abs(heights[i]-heights[i-2])+dp[i-2];
//	       dp[i]= Math.min(f,s);
//	   }
//	   return dp[n-1];
//	 }

// +++++++++++++ Memoization , sc->O(n)stack + O(n)auxiliary, tc->O(n)+++++++++

//	 public static int minEnergy(int index, int heights[],int[] dp){
//	     if(index==2) return Math.abs(heights[2]-heights[0]);
//	     if(index==1) return Math.abs(heights[1]-heights[0]);
//
//	     if(dp[index]!=0) return dp[index];
//
//	     int energy1= minEnergy(index-1, heights,dp);
//	     if(index>2) energy1+=Math.abs(heights[index]-heights[index-1]);
//	     int energy2 = minEnergy(index-2, heights,dp);
//	     if(index>2) energy2+=Math.abs(heights[index]-heights[index-2]);
//	     return dp[index]=Math.min(energy1,energy2);
//
//	 }

	// ++++++++++ extra space optimized, sc->O(1), tc->O(n) ++++++++++++
	public static int frogJump(int n, int heights[]) {
		int prev = 0;
		int prev2 = 0;
		for(int i=1;i<n;i++){
			int f = Math.abs(heights[i]-heights[i-1])+prev;
			int s = Integer.MAX_VALUE;
			if(i>1) s = Math.abs(heights[i]-heights[i-2])+ prev2;
			int curr = Math.min(f,s);
			prev2=prev;
			prev=curr;
		}
		return prev;
	}
}
