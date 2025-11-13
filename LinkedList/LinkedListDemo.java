public class LinkedListDemo {
	Node head;
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// Insert at the end
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Insert at a specific position
	public void insertAtSpecificPosition(int data, int pos) {
		if (pos == 0) {
			insertAtBeginning(data);
			return;
		}

		Node newNode = new Node(data);
		Node temp = head;

		for (int i = 0; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Position out of range");
			return;
		}

		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Delete from beginning
	public void deleteFromBeginning() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;
	}

	// Delete from end
	public void deleteFromEnd() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}

		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	// Delete at specific position
	public void deleteAtPosition(int pos) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (pos == 0) {
			deleteFromBeginning();
			return;
		}

		Node temp = head;
		for (int i = 0; i < pos - 1 && temp.next != null; i++) {
			temp = temp.next;
		}

		if (temp.next == null) {
			System.out.println("Position out of range");
			return;
		}

		temp.next = temp.next.next;
	}

	// Display list
	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		LinkedListDemo l = new LinkedListDemo();

		l.insertAtBeginning(10);
		l.insertAtEnd(20);
		l.insertAtEnd(30);
		l.insertAtSpecificPosition(15, 1);
		l.display();

		l.deleteFromBeginning();
		l.display();

		l.deleteFromEnd();
		l.display();

		l.deleteAtPosition(1);
		l.display();
	}
}