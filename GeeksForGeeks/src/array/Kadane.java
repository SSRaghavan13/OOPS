package array;

public class Kadane {
    public static int kadane(int nums[]) {
        int max = nums[0];
        int curr = 0;
        for(int i = 0; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(curr, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(kadane(nums));
    }
}