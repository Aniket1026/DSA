package programming.Oops.Principles.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(6,8,10);
        Box box1 = new Box(box);
        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,5,7);
//        System.out.println(box3.l+" "+box3.w+" "+ box3.h+" "+ box3.weight);

        Box box5 = new BoxWeight(2,4,9,11);
        System.out.println(box5.h); // It is actually the type of reference variable not the type of object
        // that determines what member can be accessed


        // There are many variables in both parent and child class
        //you are given access to variables that are in the ref type i.e. BoxWeight
        //hence , you should be able to access weight variable
        //this also means the ones you are trying to access should be initialized
        //but here, when the object itself is of type parent class, how will you call the constructor of child class
        // hence giving error

//        BoxWeight box6 = new Box(2,3,4);
    }
}
