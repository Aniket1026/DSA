package programming.Functions;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        random(1,2,4,3,67,41,20,45,33,99);   // This is variable arguments when you don't know how many arguments
        // you are going to pass when calling the function basically the ...v stores it into an array
    }
    static void random(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
