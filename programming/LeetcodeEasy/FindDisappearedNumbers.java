package programming.LeetcodeEasy;
import java.util.*;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindDisappearedNumbers {
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		List<Integer> last = findDisappearedNumbers(arr);
		System.out.println(last);
	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int i=0;
		while(i<nums.length){
			// this approach by default checks for the duplicate elements
			int correct = nums[i]-1;
			if(nums[i]!=nums[correct]){
				swap(nums,i,correct);
			}else {
				i++;
			}
		}

		for(int j=0;j<nums.length;j++){
			if(nums[j]!=j+1){
				list.add(j+1);
			}
		}
		return list;
	}
	public static void swap(int[] arr, int i , int j){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
