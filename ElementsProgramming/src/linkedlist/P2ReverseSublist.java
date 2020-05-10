package linkedlist;

public class P2ReverseSublist {
	
	public static Node<Integer> reverseSubList(Node<Integer> head, int start, int end) {
		if(start == end)
			return head;
		int count = 1;
		Node<Integer> curr = head;
		Node<Integer> next = null;
		Node<Integer> prev = null;
		Node<Integer> cutStart = null;
		Node<Integer> cutStop = null;
		curr = head;
		while(curr != null) {
			if(count == start) {
				cutStart = prev;
				cutStop = curr;
				prev = curr;
				curr = curr.next;
			}
			
			else if(count > start && count <= end) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			
			else if(count == end + 1) {
				cutStart.next = prev;
				cutStop.next = curr;
			}
			
			else {
				prev = curr;
				curr = curr.next;
			}
			count++;
		}
		return head;
	}
	
	public static Node<Integer> reverseList(Node<Integer> head, int start, int end) {
		if(start == end)
			return head;
		Node<Integer> sentinal = new Node<>(0);
		sentinal.next = head;
		Node<Integer> subListHead = sentinal;
		int count = 1;
		while(count++ < start)
			subListHead = subListHead.next;
		Node<Integer> subListIter = subListHead.next;
		while(start++ < end) {
			Node<Integer> temp = subListIter.next;
			subListIter.next = temp.next;
			temp.next = subListHead.next;
			subListHead.next = temp;
		}
		return sentinal.next;
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
//		Node<Integer> head = reverseSubList(n1, 2, 4);
//		Node.print(head);
		Node.print(reverseList(n1, 2, 4));
	}

}
