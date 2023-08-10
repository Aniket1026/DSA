package programming.StackAndQueue;

public class CustomQueue {
      private int[] data;
	  private static final int DEFAULT_SIZE = 10;
	  int end=-1;

     public CustomQueue(){
		 this(DEFAULT_SIZE);
     }
	  public CustomQueue(int size){
		  this.data = new int[size];
	  }

	  public boolean isFull(){
		 return end == data.length-1;
	  }
	  public boolean isEmpty(){
		 return end == -1;
	  }

	  public boolean insert(int val){
		 if(isFull()){
			 System.out.println("Queue is full !!!!");
			 return false;
		 }
		 data[++end]=val;
		 return true;
	  }
	  public int remove() throws Exception{
		 if(isEmpty()){
			 throw new Exception("Cannot remove from empty queue");
		 }
		 int val = data[0];
		 // shift the elements to left as 1 item has been removed
		 for(int i=0;i<data.length-1;i++){
			 data[i]=data[i+1];
		 }
		 end--;
		 data[data.length-1]=0;
		 return val;
	  }
	  public int front() throws Exception{
		  if(isEmpty()){
			  throw new Exception("queue is empty ");
		  }
		  return data[0];
	  }
	  public void display(){
		 for(int i=0;i<=end;i++){
			 System.out.print(data[i] + " <- ");
		 }
		  System.out.println("END");
	  }
}
