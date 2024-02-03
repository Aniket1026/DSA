package programming.DP;

import java.util.Scanner;

/*
Link -> https://atcoder.jp/contests/dp/tasks/dp_b
 */

public class FromJumpWithKDistance {
		public static void main(String[] args){
			Scanner scn = new Scanner(System.in);
			int N = scn.nextInt();
			int k = scn.nextInt();
			int[] heights = new int[N];
			int[] dp = new int[N];

			if(N ==1){
				System.out.println(heights[0]);
				return;
			}

			for(int i=0;i<N;i++){
				heights[i] = scn.nextInt();
			}

			for(int i=1;i<Math.min(N,k);i++){
				dp[i] = Math.abs(heights[i]-heights[0]);
			}

			for( int i=k;i<N;i++){
				int minCost = Integer.MAX_VALUE;
				for(int j=i-1;j>=i-k;j--){
					int jump = dp[j] + Math.abs(heights[i] - heights[j]);
					minCost= Math.min(minCost,jump);
				}
				dp[i] = minCost;
			}

			System.out.println(dp[N-1]);
		}
}
