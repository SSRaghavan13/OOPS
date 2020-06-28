package search;

public class P4SquareRoot {
    public static int squareRoot(int x) {
        long left = 0;
        long right = x;
        long mid;
         while(left <= right) {
            mid = left + (right - left) / 2;
            if(mid * mid > x){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return (int)left - 1;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(6));
    }
}