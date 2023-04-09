package programming.BasicProgrammingProblems;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum= sum*10+rem;
            num/=10;
        }
        System.out.println(sum);
    }
}
