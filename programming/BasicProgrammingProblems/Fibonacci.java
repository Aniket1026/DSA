package programming.BasicProgrammingProblems;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int value = scn.nextInt();
        int first=0;
        int second=1;
        int sum=0;
        System.out.println(first);
        System.out.println(second);
        for(int i=2;i<value;i++){
          sum=first+second;
          first= second;
          second=sum;
          System.out.println(sum);
        }
    }
}
