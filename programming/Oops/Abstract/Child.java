package programming.Oops.Abstract;

public class Child extends Parent {
	public Child (int age){
		super(26);
		this.age = age;
	}
	@Override
	void career(String name) {
		System.out.println("I'm going to be a"+ name);
	}

	@Override
	void marriage(String name,int age) {
		System.out.println("I'm going to marry "+ name +" at age : " +age);
	}
}
