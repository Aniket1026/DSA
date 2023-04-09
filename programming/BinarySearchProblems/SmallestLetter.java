package programming.BinarySearchProblems;
import java.util.Scanner;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallestLetter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[] letters ={'c','j','l','p'};
        char target = scn.next().charAt(0);
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + ((end-start)/2);
            if(letters[mid]>target){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return letters[start% letters.length];
    }
}
