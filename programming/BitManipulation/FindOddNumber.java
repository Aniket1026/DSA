package programming.BitManipulation;

/*
Given an array of numbers every number appears odd number of time 3,5,7 etc...
Except one which appears only once
Find that number

Approach : Count the no of 1 bit at each position for every number and store them in an array
Since every number is appearing suppose 3 times . So the no. of bit 1bit at each position inside array
would be a factor of 3
SO when a number appearing only once is also added now the array wouldn't contains 1 bit as a factor of 3.
Take the modulo to find the number

 */
public class FindOddNumber {
	public static void main(String[] args) {
       int[] arr ={7,7,3,2,7,7,2,3,2,3,3,2,3,7,2,8};
	   int repeat =5;
		System.out.println(findOddBit(arr,repeat));
	}

	public static int findOddBit(int[] arr, int repeat) {
		int[] sum = new int[8];

		for(int n:arr){
			int c= sum.length-1;
			while(n>0){
				int rem = n%2;
				sum[c]=sum[c]+rem;
				n=n/2;
				c--;
			}
		}

		for(int i=0;i<sum.length;i++){
			sum[i]= sum[i]%repeat;
		}

		int ans =0;
		int j=0;
		for(int i= sum.length-1;i>=0;i--){
			ans = ans+ (int)(sum[i]*Math.pow(2,j));
			j++;
		}
		return ans;
	}
}
