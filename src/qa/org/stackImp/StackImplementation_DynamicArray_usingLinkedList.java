package qa.org.stackImp;

public class StackImplementation_DynamicArray_usingLinkedList {
        Node head;
		class Node{
			int value;
			Node next;
		}
		
		public StackImplementation_DynamicArray_usingLinkedList() {
			head=null;
		}
		
		public void push(int value) {
			
		    Node extraNode=head;//head value points to extraNode which is null
		    head= new Node();//Object is created for node
		    head.value=value;//pushed value is stored in the head.value
		    head.next=extraNode;//extraNode points to head.next in the front side of the queue, which again continues in the next step for second node
		    System.out.println("The Pushed element is "+head.value);
	    }
	
	public void pop() {
		if(head==null) {
			System.out.println("The Stack is empty");
		}
		else {
	        int value = head.value;//head.value the value to be removed is stored in the value
		    head = head.next;//head.next points to the next node in the rear side of the queue, which can be removed in the next step .
			System.out.println("The Popped element is "+value);
		}
	}
		public static void printList(Node head) {
		    Node temp=head;
			while(temp!=null) { 
				System.out.println(temp.value+" ");
				temp=temp.next;
			}
	   }

	public static void main(String[] args) {
        StackImplementation_DynamicArray_usingLinkedList obj= new StackImplementation_DynamicArray_usingLinkedList();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.pop();
        printList(obj.head);
      }

}
