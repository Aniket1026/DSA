package programming.Functions;
/*
function overloading takes place at compile time.Where it decides which function to run by looking at the arguments
function overloading is defining function with same name but with at least have one difference as
 -> return type
 -> number of parameters
 -> type of parameters
 */
public class FunctionOverloading {
    public static void main(String[] args) {
       fun(2);
       fun("aniket");
       fun(2,"kaimse");
       fun("Hitesh");
    }
    static void fun(int x){
        System.out.println(x);
    }
    static int fun(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    static int fun(int a, String b){
        System.out.println(b);
        return a;
    }
    static String fun(String a){
        System.out.println(a);
      return a;
    }

}
