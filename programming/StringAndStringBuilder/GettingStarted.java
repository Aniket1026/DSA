package programming.StringAndStringBuilder;

// Strings are collection of characters.
// Since string are special objects in java
// String objects are immutable,but you can point the reference variable to another object

public class GettingStarted {
	public static void main(String[] args) {
		String a = "Aniket";
		System.out.println(a);
		a ="Anubhav"; // this is valid because now a is pointing to new object
	}
}
