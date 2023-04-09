package programming.Oops.Static;

public class StaticBlock {
    static int a=5;
    static int b;

    // will run only once,when the class is loaded for the first time
    static {
        System.out.println("I am inside static block");
        b=a*10; // you initialize static variable inside static block
    }

    public static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

//        StaticBlock.b+=3;
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

//        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
    }
}
