package linkedlist;

public class P6OddEvenMerge {
    public static Node<Integer> oddEvenMerge(Node<Integer> head) {
        Node<Integer> even = head;
        Node<Integer> odd = head.next;
        Node<Integer> temp = odd;
        while(odd != null && odd.next != null) {
            even.next = odd.next;
            even = even.next;
            odd.next = even.next;
            odd = odd.next;
        }
        even.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(2);
		Node<Integer> n2 = new Node<Integer>(3);
		Node<Integer> n3 = new Node<Integer>(5);
		Node<Integer> n4 = new Node<Integer>(3);
        Node<Integer> n5 = new Node<Integer>(2);
        Node<Integer> n6 = new Node<Integer>(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
        n6.next = null;
        Node.print(oddEvenMerge(n1));
    }
}