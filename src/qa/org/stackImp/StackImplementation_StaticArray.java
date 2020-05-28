package qa.org.stackImp;

public class StackImplementation_StaticArray {

	int size;
	int arr[];
	int top;
	
	public StackImplementation_StaticArray(int size) {
	this.size=size;
	this.arr= new int [10];
	this.top=-1;
	}
	
	public int push(int element) {
		if(!isFull()) {
			top++;
			arr[top]=element;
			System.out.println("The Pushed element is "+arr[top]);
			return arr[top];
		}
		else {
			System.out.println("The Stack is full");
			return -1;
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			int removedElement=top;
			top--;
			System.out.println("The Poped element is "+arr[removedElement]);
			}
		else {
			System.out.println("The Stack is Empty");
		}
	}
	
	public void peek() {
		if(!isEmpty()) {
			int peekElement=top;
			System.out.println("The Peek element is "+arr[peekElement]);
		}
		else {
			System.out.println("The Stack is Empty");
		}
	}
	
	
	
	public boolean isFull() {
		return (size-1==top);
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	public void sayWishes() {
		System.out.println("Hello sir!. Many more happy returns of the day.");
		System.out.println("Conflicts Solved.");
	}
	public void sayHello() {
		System.out.println("Hello sir!. Good Evening.");

	}
	
	public static void main(String[] args) {

	StackImplementation_StaticArray si_sa= new StackImplementation_StaticArray(9);
	si_sa.push(100);
	si_sa.push(200);
	si_sa.push(300);
	
	si_sa.pop();
	si_sa.pop();
	
	si_sa.peek();
    }

}
