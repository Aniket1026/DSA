package programming.Oops.Abstract;

public abstract class Parent {
	int age;
	public Parent(int age){
       this.age = age;
	}
	abstract void career (String name);
	abstract void marriage(String name,int age);
}
