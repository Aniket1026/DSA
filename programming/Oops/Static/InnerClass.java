package programming.Oops.Static;


public class InnerClass {
   static class Test{
       String name;
       public Test(String name){
       this.name = name;
     }
      void message() {
          System.out.println("main called");
      }

       @Override
       public String toString() {
           return name+"Dubey";
       }
   }

    public static void main(String[] args) {
            Test a = new Test("Aniket");
        System.out.println(a.name);
        a.message();
        System.out.println(a);
    }
    static void fun(){
        System.out.println("fun");
    }
}
