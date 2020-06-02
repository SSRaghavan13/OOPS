package linkedlist;

public class P4RemoveDuplicatesFromSortedList {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp != null) {
            Node<Integer> nextNode = temp.next;
            while(nextNode != null && nextNode.val == temp.val)
                nextNode = nextNode.next;
            temp.next = nextNode;
            temp = nextNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(2);
		Node<Integer> n4 = new Node<Integer>(3);
        Node<Integer> n5 = new Node<Integer>(3);
        Node<Integer> n6 = new Node<Integer>(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
        n5.next = n6;
        n6.next = null;
		Node.print(removeDuplicates(n1));
    }
}