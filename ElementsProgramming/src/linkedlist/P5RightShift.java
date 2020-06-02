package linkedlist;

public class P5RightShift {
    public static Node<Integer> rightCyclicShift(Node<Integer> head, int k) {
        if(head == null)
            return head;
        Node<Integer> dummyHead = new Node<Integer>(0);
        dummyHead.next = head;
        Node<Integer> temp = dummyHead;
        int counter;
        int len = 0;
        while(temp.next != null) {
            len++;
            temp = temp.next;
        }
        temp.next = head;
        counter = len - k;
        temp = dummyHead;
        while(counter-- > 0)
            temp = temp.next;
        Node<Integer> newHead = temp.next;
        temp.next = null;
        dummyHead.next = newHead;
        return dummyHead.next;
    }
    
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(2);
		Node<Integer> n2 = new Node<Integer>(3);
		Node<Integer> n3 = new Node<Integer>(5);
		Node<Integer> n4 = new Node<Integer>(3);
        Node<Integer> n5 = new Node<Integer>(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
        n5.next = null;
        Node.print(rightCyclicShift(n1, 3));
    }
}