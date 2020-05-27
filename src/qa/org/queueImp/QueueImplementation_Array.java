package qa.org.queueImp;

public class QueueImplementation_Array {

	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentsize;
	
	public QueueImplementation_Array(int sizeofQueue) {
		this.capacity=sizeofQueue;
		this.queueArr= new int [this.capacity];
		this.front=0;
		this.rear=-1;
		}
	
	public int enque(int element) {
		rear++;
		if(rear==capacity-1) 
			rear=0;
			queueArr[rear]=element;
			System.out.println("The enqued element is "+queueArr[rear]);
			currentsize++;
			return queueArr[rear];
	}
	
	public void deque() {
		front++;
		if(front==capacity-1) {
			System.out.println(queueArr[front-1] +" element is dequed");
			front=0;
		}
		else {
			System.out.println(queueArr[front-1]+ " element is dequed");
		}
	}
	public boolean isEmpty() {
		if(currentsize==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(currentsize==capacity-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
        QueueImplementation_Array obj= new QueueImplementation_Array(10);
        obj.enque(10);
        obj.enque(20);
        obj.enque(30);
        obj.enque(40);
        obj.enque(50);
        obj.enque(60);
        obj.enque(70);
        obj.enque(80);
        obj.enque(90);
        
        obj.deque();
       }
	}
