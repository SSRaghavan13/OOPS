package linkedlist;

public class P3RemoveKthFromLast {
    public static Node<Integer> removeKthFromLast(Node<Integer> head, int k) {
        Node<Integer> dummyHead = new Node<Integer>(0);
        dummyHead.next = head;
        Node<Integer> first = dummyHead.next;
        Node<Integer> second = dummyHead;
        int counter = k;
        while(counter-- > 0)
            first = first.next;
        while(first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummyHead.next;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(3);
		Node<Integer> n4 = new Node<Integer>(4);
        Node<Integer> n5 = new Node<Integer>(5);
        Node<Integer> n6 = new Node<Integer>(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
        n5.next = n6;
        n6.next = null;
		Node.print(removeKthFromLast(n1, 3));
    }
}