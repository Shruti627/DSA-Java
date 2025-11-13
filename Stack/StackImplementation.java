public class StackImplementation {
	
	int []arr;
	int top;
	int capacity;
	
	StackImplementation(int size){
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	
	void push(int x) {
		if(top==capacity-1) {
			System.out.println("Stack overflow..!");
			return;
			
		}
		arr[++top]=x;
	}
	
	int pop() {
		if (top==-1) {
			System.out.println("Stack underflow..!");return -1;
		}
		return arr[top--];
	}
	int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty..!");
			return -1;
		}
		return arr[top];
		
	}
	
	boolean isEmpty() {
		return top==-1;
	}
	void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty..!");
			return;
			
		}
		System.out.println("Stack: ");
		for (int i = 0; i <=top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		StackImplementation s=new  StackImplementation(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		System.out.println(s.peek());
		s.pop();
		s.display();
		System.out.println(s.isEmpty());
		
				
		
	}

}
