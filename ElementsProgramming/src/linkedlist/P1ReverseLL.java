package linkedlist;

public class P1ReverseLL {
	
	public static Node<Integer> reverseLinkedList(Node head) {
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		Node<Integer> next;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(3);
		Node<Integer> n4 = new Node<Integer>(4);
		Node<Integer> n5 = new Node<Integer>(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		Node<Integer> head = reverseLinkedList(n1);
		Node.print(head);
	}

}
