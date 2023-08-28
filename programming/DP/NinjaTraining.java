package programming.DP;

public class NinjaTraining {

	public static void main(String[] args) {
		// problem link
		// -> https://www.codingninjas.com/studio/problems/ninja-s-training_3621003

	}

// recursive approach which gives tc->O(2^n) , sc -> stack space O(n) + auxiliary space O(1)
//	public static int ninjaTraining(int day,int lastChoice,int points[][]){
//		if(day==0){
//			int max =0;
//			for(int i=0;i<3;i++){
//				if(points[0][i]>max && i!=lastChoice)
//					max = points[0][i];
//			}
//			return max;
//		}
//		int max =0;
//		for(int task=0;task<3;task++){
//			if(task != lastChoice){
//				int point = points[day][task] + ninjaTraining(day-1,task, points);
//				max = Math.max(max, point);
//			}
//		}
//		return max;
//	}


// ++++++++++++++++++++++++ Memoization tc->O(n), sc-> O(n)stack + O(n*4)auxiliary ++++++++++++

//	public static int maxPoints(int day , int lastChoice ,int points[][], int dp[][]){
//		if(day==0){
//			int max =0;
//			for(int i=0;i<3;i++){
//				if(points[0][i]>max && i!=lastChoice)
//					max = points[0][i];
//			}
//			return max;
//		}
//		if(dp[day][lastChoice]!= -1) return dp[day][lastChoice];
//
//		int max =0;
//		for(int task=0;task<3;task++){
//			if(task != lastChoice){
//				int point = points[day][task] + maxPoints(day-1,task, points, dp);
//				max = Math.max(max,point);
//			}
//		}
//		return dp[day][lastChoice]= max;
//	}

// +++++++++++++++++++ Tabulation tc-> O(n*4*3) , sc->O(n*4) auxiliary +++++++++++++++++++
//	public static int ninjaTraining(int n, int points[][]) {
//
//		// Write your code here..
//		int[][] dp = new int[n][4];
//		dp[0][0] = Math.max(points[0][1], points[0][2]);
//		dp[0][1]= Math.max(points[0][0],points[0][2]);
//		dp[0][2] = Math.max(points[0][0],points[0][1]);
//		dp[0][3]= Math.max(points[0][2],Math.max(points[0][0],dp[0][1]));
//
//		for(int day=1;day<n;day++){
//			for(int last=0;last<4;last++){
//				dp[day][last] =0;
//				for(int task =0;task<3;task++){
//					if(task != last){
//						int point = points[day][task] + dp[day-1][task];
//						dp[day][last] = Math.max(point, dp[day][last]);
//					}
//				}
//			}
//		}
//		return dp[n-1][3];
//	}


// +++++++++++++++++++++   extra space optimized  ++++++++++++++++++
//	public static int ninjaTraining(int n, int points[][]) {
//
//		// Write your code here..
//		int[] prev = new int[4];
//		prev[0] = Math.max(points[0][1], points[0][2]);
//		prev[1]= Math.max(points[0][0],points[0][2]);
//		prev[2] = Math.max(points[0][0],points[0][1]);
//		prev[3]= Math.max(points[0][2],Math.max(points[0][0],points[0][1]));
//
//		for(int day=1;day<n;day++){
//			int temp[]= new int[4];
//			for(int last=0;last<4;last++){
//				temp[last] =0;
//				for(int task =0;task<3;task++){
//					if(task != last){
//						temp[last] = Math.max(temp[last], prev[task]+points[day][task]);
//					}
//				}
//			}
//			prev= temp;
//		}
//		return prev[3];
//	}
}
