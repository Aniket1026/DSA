package programming.DP;
// Link -> https://leetcode.com/problems/min-cost-climbing-stairs/description/
// problem ->
//    You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
//    Once you pay the cost, you can either climb one or two steps.
//    You can either start from the step with index 0, or the step with index 1.
//    Return the minimum cost to reach the top of the floor.
public class MinCostClimbing {
	// Memoized approach but remove the storage array and it becomes the only recursion used approach
	// only recursive approach has complexity exponential as O(2^n)

	public int minCostClimbingStairs(int[] cost) {
		int[] storage = new int[cost.length+1];
		int zeroIndexCost = climbCost(0,cost,storage);
		int firstIndexCost = climbCost(1,cost,storage);
		return Math.min(zeroIndexCost,firstIndexCost);
	}

	public int climbCost(int index,int[] cost,int[] storage){
		if(index == cost.length-1) return cost[index];
		if(index == cost.length) return 0;
		if(storage[index] !=0) return storage[index];
		int fcost =  climbCost(index+1,cost,storage);
		int scost =  climbCost(index+2,cost,storage);
		return storage[index] = Math.min(fcost,scost) + cost[index];
	}

	// Tabulation :
	//      ith index of Storage Array represents the min cost to reach the ith step
	//      but you have to reach the top i.e. at the index cost.length+1 and tell the cost
	//      took you to reach this far

	public int minCostClimbingStairs(int[] cost) {
		int[] climb_cost = new int[cost.length+1];
		climb_cost[0] = cost[0];
		climb_cost[1] = cost[1];

		for(int i = 2; i<cost.length; i++){
			climb_cost [i] = Math.min(climb_cost[i-1],climb_cost[i-2])+cost[i];
		}
		return Math.min(climb_cost[cost.length-1],climb_cost[cost.length-2]);
	}
}
