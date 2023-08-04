package programming.LinkedList;

public class Main {
	public static void main(String[] args) {
        LL list = new LL();
		list.insertFirst(9);
		list.insertFirst(5);
		list.insertFirst(3);
		list.insertFirst(10);
		list.insertFirst(31);
		list.insertLast(26);
		list.index(4,3);
		list.index(2,-3);
		list.index(22,8);

//		list.display();
		System.out.println(list.deleteFirst());
//		System.out.println(list.deleteLast());
		list.display();
		System.out.println(list.delete(3));
		list.display();
	}
}
