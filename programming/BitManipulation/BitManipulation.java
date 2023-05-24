package programming.BitManipulation;
import java.util.*;

public class BitManipulation {
	public static void main(String[] args) {
	   // Find whether the no. is even or odd
		/*
		last digit helps in determining odd or even.
		 */
	   Scanner scn = new Scanner(System.in);
	   int a = scn.nextInt();
	   if((a&1)==0){
		   System.out.println("Even hai number");
		   return;
	   }
		System.out.println("Odd hai number");
	}
}
