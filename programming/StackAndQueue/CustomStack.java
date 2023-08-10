package programming.StackAndQueue;

public class CustomStack {
	int[] data;
private static final int DEFAULT_SIZE = 10;
private int ptr =0;

public CustomStack(){
	this(DEFAULT_SIZE);
   }
public CustomStack(int size){
	this.data = new int[size];
      }

	  public boolean push(int item){
			if(isFull()){
				System.out.println("Stack is full");
				return false;
			}
			ptr++;
			data[ptr]=item;
			return true;
	  }

	  public int pop() throws StackException {
	    if(isEmpty()){
			throw new StackException("Cannot pop from an empty stack");
	    }
	    int val = data[ptr];
		ptr--;
		return val;
	  }

	  public int peek() throws StackException {
	     if(isEmpty()){
			 throw new StackException("Cannot peek from an empty stack");
		 }
	    return data[ptr];
	  }

	  boolean isFull () {
	    return ptr==data.length-1;
	}
	boolean isEmpty(){
	  return ptr == -1;
	}

}
