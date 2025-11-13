import java.util.Scanner;
import java.util.Stack;

public class isBalanced {

	public static boolean isBalanced(String s) {

		Stack<Character> stack = new Stack<Character>();
		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') {
					return false;

				}
			}
		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(isBalanced(str) ? "Yes" : "No");
	}

}
