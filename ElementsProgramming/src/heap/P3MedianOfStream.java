package heap;

import java.util.PriorityQueue;

public class P3MedianOfStream {
    public static void mediumofStream(int[] data) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for(int i = 0; i < data.length; i++) {
            if(minHeap.isEmpty())
                minHeap.add(data[i]);
            else {
                if(data[i] >= minHeap.peek())
                    minHeap.add(data[i]);
                else
                    maxHeap.add(data[i]);
            }
        }

        if(minHeap.size() > maxHeap.size() + 1)
            maxHeap.add(minHeap.remove());
        else if(maxHeap.size() > minHeap.size())
            minHeap.add(maxHeap.remove());

        System.out.println((maxHeap.size() == minHeap.size()) ? (0.5 * minHeap.peek() * maxHeap.peek()) : minHeap.peek());
    }

    public static void main(String[] args) {
        mediumofStream(new int[] {1, 0, 3, 5, 2, 0, 1});
    }
}