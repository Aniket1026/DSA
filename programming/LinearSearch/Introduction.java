package programming.LinearSearch;
import java.util.Scanner;

/*
Linear Search is defined as a sequential search algorithm that starts at one end and goes through
each element of a list until the desired element is found,
otherwise the search continues till the end of the data set. It is the easiest searching algorithm

Complexity :
 time complexity
   best case - O(1) -> if element is found at first index
   worst case - O(n) -> if element is found at last index
 Space complexity - O(n) -> A no extra space is required

 */
public class Introduction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int[] arr ={1,25,38,9,90,45,88,100,4638};
       int target = scn.nextInt();
        System.out.println(linearSearch(arr,target));
    }

    static int linearSearch( int[] arr , int target){
        // check if array is of zero size
        if(arr.length==0){
            return -1;
        }
        // run a for loop to iterate over every index
        for( int index=0;index< arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }
        // if none of the above case is hit it means target element is not found
        return -1;
    }
}
