package programming.Oops.Principles.Polymorphism;

public class Square extends Shapes {
	// This will run when the object of circle is being created
	// hence this is overriding the method of parent class
	@Override // annotation used to check if the method is being over-written
	void area(){
		System.out.println("I'm in square class");
	}
}
