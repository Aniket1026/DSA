package programming.Oops.Introduction;

public class Introduction {
    public static void main(String[] args) {
        // store roll no of 5 students
        int[] r_no = new int[5];

        // store name of 5 students
        String[] name = new String[5];

        // Store r_no,marks and names of 5 student
        int[] rNo= new int[5];
        float[] marks = new float[5];
        String[] names = new String[5];

        // try storing all these properties in a single type , this is where we used classes
//        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));
        Student aniket = new Student();
        System.out.println(aniket.rNo);
        System.out.println(aniket.name);
        System.out.println(aniket.marks);
//        aniket.changeName("Dubey");
//        aniket.greeting();

        Student random = new Student();
    }
}
    class Student {
        int rNo;
        float marks;
        final String name;

        void greeting(){
            System.out.println("hello my name is "+ name);
        }

//        void changeName(String newName){
//            name = newName;
//        }

        Student () {
           // This is how you call a constructor inside a constructor
           // Internally : new Student(26,"diljeet",75);
            this (26,"diljeet",75);
        }

        Student (int rno, String name,int marks) {
            rNo = rno;
            this.name= name;
            this.marks= marks;
        }

        Student (Student other){   // this will e replaced with random and other with aniket
            this.name = other.name;
            this.rNo = other.rNo;
            this.marks = other.marks;
        }
    }