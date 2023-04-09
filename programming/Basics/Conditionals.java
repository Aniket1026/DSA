package programming.Basics;

public class Conditionals {
    public static void main(String[] args) {
        /*
        Syntax for if else conditions
        if(Condition inside here is true){
             this body executes if only above condition is true
            }else{
            it executes only if condition is not true
            }
         */
             int amount = 12000;
             if(amount>1000){
               amount+=500;
             }else{
                 amount-=500;
             }
              System.out.println(amount);
        /*
        if you had more than one conditions you can use multiple if else
         */
        int age = 14;
        if(age>10){     // if condition is true it's body runs
            System.out.println("yes my age is "+age);
        } else if(age>10 && age<16){    // if above condition is not and both the condition here is true it runs
            System.out.println("My age is"+age);
        }else{     // if none of the above condition is true this will execute
            System.out.println("I'm still ageing");
        }
    }
}
