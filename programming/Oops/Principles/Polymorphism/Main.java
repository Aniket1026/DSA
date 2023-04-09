package programming.Oops.Principles.Polymorphism;

public class Main {
	public static void main(String[] args) {
	    Shapes shapes = new Shapes();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Shapes square = new Square();
        // So parent class reference variable decides what methods are accessible but
		// the object type variable tells which method out of the accessible ones is available
		square.area();
	}
}
