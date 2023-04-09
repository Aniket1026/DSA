package programming.LeetcodeEasy;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
import java.util.Scanner;

public class FindNumberOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size =  scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(countEvenDigits(arr));

    }
    static int countEvenDigits( int[] arr){
        int count =0;
        for( int i=0;i< arr.length;i++){
            int num = (int)Math.log10(arr[i]);
            if(num%2==0){
                count++;
            }
        }
        return count;
    }
}
