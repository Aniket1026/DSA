package programming.BasicProgrammingProblems;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean val =prime(n);
        System.out.println(val);
    }
    static boolean prime(int n){
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
