package programming.StringAndStringBuilder;

public class Comparison {
	public static void main(String[] args) {
		// String comparison can be done using to ways
		// 1-> using == comparator but this is not preferred as it matches the value
		// as well the reference to which it is pointing to and cases where the values
		// are same but pointing to different objects gives false
		// you can create string with similar values but pointing to
		// different objects using the new keyword which is shown below

		// 2 ->.equals method is used for above, mentioned reasons which compares only
		// the values and not the reference

		// String created are stored in pool where similar objects are not created again
		// so here a and b both are pointing to the same object

	    String a = "Aniket";
		String b = "Aniket";
		System.out.println(a==b);

		String name1 = new String("Aniket");
		System.out.println(a==name1);

		String name2 = new String("Aniket");
		System.out.println(name1==name2);

        // .equals method is not case,sensitive it only compares the values
		System.out.println(name1.equals(name2));
		System.out.println(a.equals(name1));
	}
}
