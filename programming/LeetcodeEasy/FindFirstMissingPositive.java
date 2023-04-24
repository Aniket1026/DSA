package programming.LeetcodeEasy;
// https://leetcode.com/problems/first-missing-positive/
public class FindFirstMissingPositive {
	public static void main(String[] args) {
       int[] arr ={3,4,-1,1};
	   int ans = firstMissingPositive(arr);
		System.out.println(ans);
	}
	public static int firstMissingPositive(int[] nums) {
		int i=0;
		while(i<nums.length){
			int correct = nums[i]-1;
			if(nums[i] < nums.length && nums[i]>0 && nums[i]!=nums[correct]){
				swap(nums,i,correct);
			}else{
				i++;
			}
		}

		for(int j=0;j<nums.length;j++){
			if(nums[j]!=j+1){
				return j+1;
			}
		}
		return nums[nums.length-1]+1;
	}
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
