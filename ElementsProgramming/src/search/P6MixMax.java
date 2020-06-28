package search;

public class P6MixMax {
    public static int[] minMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num: arr) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        int[] result = minMax(new int[] {3,2,5,1,2,4});
        for(int num: result)
            System.out.println(num);
    }
}