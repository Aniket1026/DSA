package programming.BinarySearchProblems;
import java.util.Scanner;
/*
So this is an assumed array of infinite size which means you cannot use arr.length function to get the end index
So find the target element in the infinite array
Approach :
Take array in chunks of size which means take an array of size 2 and see if the target element lies
in this range, if not then double the size of chunks and do the same thing .At the moment when you find
the chunk of array in which the target lies. Use binary search in that chunk of array.
 */

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr={1,2,4,5,45,56,67,70,79,80,90,97,99,102,110,118,200,290,312,450};
        int target = 90;
        int ans = searchIndexInInfiniteArray(arr,target);
        System.out.println(ans);
    }
    static int searchIndexInInfiniteArray(int[] arr,int target){
         int start=0;
         int end =1;

         while(target>arr[end]){
             int newStart = end +1;
             end= end+(end-start +1)*2;
             start = newStart;
         }

         while(start<=end) {
             int mid = start + ((end - start) / 2);
             if (arr[mid] == target) {
                 return mid;
             } else if (arr[mid] < target) {
                 start = mid + 1;
             } else {
                 end = mid - 1;
             }
         }
        return -1;
    }
}
