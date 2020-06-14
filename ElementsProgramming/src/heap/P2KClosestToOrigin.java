package heap;

import java.util.PriorityQueue;

public class P2KClosestToOrigin {
    public static int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        for(int[] point: points) {
            heap.add(point);
            if(heap.size() > K)
                heap.poll();
        }
        int[][] result = new int[K][2];
        int index = K - 1;
        while(!heap.isEmpty())
            result[index--] = heap.poll();
        return result;
    }

    public static void main(String[] args) {
        int[][] result = kClosest(new int[][] {{3,3},{5,-1},{-2,4}}, 2);
        for(int[] point: result) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}