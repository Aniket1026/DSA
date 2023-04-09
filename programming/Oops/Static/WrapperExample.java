package programming.Oops.Static;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        // to use a primitive as an object we have wrapper class
        // since this is a class it provides different useful methods
        Integer num =5;
        final A aniket = new A("Ketu");
        aniket.name="Dubey"; // possible
        // when a non-primitive is final , you cannot reassign it
//        aniket = new A("New object"); // not possible to reassign as it is using final keyword

        A obj;
        for( int i=0;i<10000000;i++){
            obj = new A("hitesh");
        }

    }

    static void fun(){
//        greeting(); you cannot use it bcz it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access any non-static stuff without referencing their instances in
        // a static context
        // hence , here we are referencing it
        WrapperExample obj = new WrapperExample();
        obj.greeting();
    }

    void fun1(){
        greeting();
    }

    void greeting(){
        System.out.println("hello");
    }
}
class A {
    final int num =10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being destroyed");
    }
}