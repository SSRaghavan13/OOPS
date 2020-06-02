package stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNonRepeatingCharInStream {
    public static void firstNonRepeatingQueue(String stream) {
        Queue<Character> queue = new LinkedList<>();
        char arr[] = new char[26];
        for(int i = 0; i < stream.length(); i++) {
            char element = stream.charAt(i);
            queue.add(element);
            arr[element - 'a']++;
            while(!queue.isEmpty()) {
                if(arr[queue.peek() - 'a'] > 1)
                    queue.poll();
                else {
                    System.out.print(queue.peek() + " ");
                    break;
                }
            }
            if(queue.isEmpty())
                System.out.print(-1 + " ");
        }
    }

    public static void firstNonRepeatingDoublyLL(String stream) {
        List<Character> dll = new ArrayList<>();
        boolean[] repeated = new boolean[26];
        for(int i = 0; i < stream.length(); i++) {
            char present = stream.charAt(i);
            if(!repeated[present - 'a']) {
                if(!(dll.contains(present)))
                    dll.add(present);
                else {
                    dll.remove((Character)present);
                    repeated[present - 'a'] = true;
                }
            }
            if(dll.size() != 0) {
                System.out.println("First non repeating character is " + dll.get(0));
            }
            else
                System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        String str = "aabc"; 
        firstNonRepeatingQueue(str);
        System.out.println();
        firstNonRepeatingDoublyLL(str); 
    }
}