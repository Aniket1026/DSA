package programming.LeetcodeEasy;

// https://leetcode.com/problems/missing-number/
/*
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Test case 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
2 is the missing number in the range since it does not appear in nums.

Test case 2:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
8 is the missing number in the range since it does not appear in nums.


 */
public class MissingNumber {
	public static void main(String[] args) {
		//Approach 1 with cyclic sort
		int[] arr ={9,6,4,2,3,5,7,0,1};
		int ans = missingNumber(arr);
		int value = solution(arr);
		System.out.println(value);
	}
	public static int missingNumber(int[] arr){

		for(int i=0;i< arr.length;){
			if(arr[i]< arr.length && arr[i]!=i){
				swap(arr,i,arr[i]);
			}else{
				i++;
			}
		}
		for(int j=0;j< arr.length;j++){
			if(arr[j]!=j){
				return j;
			}
		}
		return arr.length;
	}
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	//Approach 2 without cyclic sort a better solution with less complexity
	public static int solution(int[] arr){
		int sum =0;
		for(int i=0;i<= arr.length;i++){
			sum+=i;
		}

		for(int i=0;i< arr.length;i++){
			sum-=arr[i];
		}

		return sum;
	}
}
