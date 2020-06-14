package linkedlist;

public class Node<Type> {
	public Type val;
	public Node<Type> next;
	
	public Node(Type val) {
		this.val = val;
	}
	
	public static void print(Node<?> head) {
		Node<?> p1 = head;
		while(p1 != null) {
			System.out.println(p1.val);
			p1 = p1.next;
		}
	}
}
