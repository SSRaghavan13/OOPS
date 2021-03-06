package linkedlist;

public class P7PalindromeLL {
    public static boolean isLinkedListAPalindrome(Node<Integer> head) {
        if(head == null)
            return true;
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node<Integer> firstHalf = head;
        Node<Integer> secondHalf = P1ReverseLL.reverseLinkedList(slow);
        while(secondHalf != null && firstHalf != null) {
            if(secondHalf.val != firstHalf.val)
                return false;
            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(2);
		Node<Integer> n2 = new Node<Integer>(3);
		Node<Integer> n3 = new Node<Integer>(5);
		Node<Integer> n4 = new Node<Integer>(5);
        Node<Integer> n5 = new Node<Integer>(3);
        Node<Integer> n6 = new Node<Integer>(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
        n6.next = null;
        System.out.println(isLinkedListAPalindrome(n1));
    }
}