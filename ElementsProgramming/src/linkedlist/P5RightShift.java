package linkedlist;

public class P5RightShift {
    public static Node<Integer> rightCyclicShift(Node<Integer> head, int k) {
        Node<Integer> dummyHead = new Node<Integer>(0);
        dummyHead.next = head;
        Node<Integer> temp = dummyHead;
        int counter = k;
        while(counter-- > 0)
            temp = temp.next;
        Node<Integer> newHead = temp.next;
        temp.next = null;
        dummyHead.next = newHead;
        while(newHead.next != null)
            newHead = newHead.next;
        newHead.next = head;
        return dummyHead.next;
    }

    public static Node<Integer> cyclicallyRightShiftList(Node<Integer> head, int k) {
        if(head == null)
            return head;
        Node<Integer> tail = head;
        int n = 1;
        while(tail.next != null) {
            ++n;
            tail = tail.next;
        }
        k %= n;
        if(k == 0)
            return head;
        
        tail.next = head;
        int stepToNewHead = n - k;
        Node<Integer> newTail = tail;
        while(stepToNewHead-- > 0)
            newTail = newTail.next;
        Node<Integer> newHead = newTail.next;
        newTail.next = null;
        return newHead;
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
        System.out.println("--------------------------------------------------------");
        Node.print(cyclicallyRightShiftList(n1, 3));
    }
}