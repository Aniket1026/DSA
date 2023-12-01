package programming.HashpMap;

import java.util.ArrayList;
import java.util.HashMap;

/*
LCS -> Longest consecutive subsequence
Problem Link -> https://leetcode.com/problems/longest-consecutive-sequence/description/
Possible solution approach -> https://takeuforward.org/data-structure/longest-consecutive-sequence-in-an-array/
 */
public class LCS {

	public static void main(String[] args) {
		int[] nums = {10,5,9,1,11,8,6,15,3,12,2};
		HashMap<Integer,Boolean> hashMap = new HashMap<>();
		ArrayList<Integer> list = longestSequence(hashMap,nums);
		System.out.println("LCS -> "+list);
	}

	// Instead of count of longest consecutive sequence the function returns the array for longest consecutive sequence
	private static ArrayList<Integer> longestSequence(HashMap<Integer,Boolean> hashmap, int[] nums){
		for(Integer num : nums){
			hashmap.put(num,true);
		}

		for(Integer num: nums){
		   if(hashmap.containsKey(num-1)) hashmap.put(num,false);
		}

       ArrayList<Integer> list = new ArrayList<>();
		int maxCount = 0;

		for(Integer num : hashmap.keySet()){
			if(hashmap.get(num)){
				ArrayList<Integer> ls = new ArrayList<>();
				int count =1;
		        ls.add(num);

			   while(hashmap.containsKey(num+1)){
				   ls.add(num+1);
				   num++;
				   count++;
			   }

			   if(count>maxCount){
				   list = ls;
				   maxCount=count;
				   System.out.println("Intermediate lists ->"+list);
				   System.out.println(maxCount);
			   }
			}
		}
		return list;
	}
}
