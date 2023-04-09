package programming.BasicProgrammingProblems;
import java.util.Scanner;
/*
Question description - > ArmStrong Numbers
The sum of cube of the individual digits of the number must be equal to the original number
example :
153 = (1^3)+(5^3)+(3^3) = 1 + 125 + 27 = 153;
 */

public class ArmStrongNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        armStrong(n);
    }

    static void armStrong(int n){
        for(int i=1;i<=n;i++){
             if(isTrue(i)){
                 System.out.println(i);
             }
        }
    }

    static boolean isTrue (int n){
        int sum =0;
        int val =n;
        while(val>0){
            int rem= val%10;
            val=val/10;
            sum = sum + rem*rem*rem;
        }
        return sum == n;
    }
}
