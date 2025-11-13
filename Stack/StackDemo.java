import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(12);
		stack.push(89);
		stack.push(90);
		
		System.out.println(stack);
		System.out.println("peek element : "+stack.peek());
		System.out.println("popped element : "+stack.pop());
		System.out.println("peek element : "+stack.peek());
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
	}

}
