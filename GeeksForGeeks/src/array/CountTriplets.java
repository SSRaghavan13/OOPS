package array;

public class CountTriplets {
    public static int cointTriplets(int[] nums) {
        int maxval = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++)
            maxval = Math.max(maxval, nums[i]);
        int frequency[] = new int[maxval + 1];
        for(int i = 0; i < nums.length; i++)
            frequency[nums[i]]++;
        count += frequency[0] * (frequency[0] - 1) * (frequency[0] - 2) / 6;
        System.out.println(count);
        for(int i = 1; i <= maxval; i++)
            count += frequency[0] * frequency[i] * (frequency[i] - 1) / 2;
        System.out.println(count);
        for(int i = 1; 2 * i <= maxval; i++)
            count += frequency[i] * (frequency[i] - 1) * frequency[2 * i] / 2;
        System.out.println(count);
        for(int i = 1; i <= maxval; i++) {
            for(int j = 1; i + j <= maxval; j++)
                count += frequency[i] * frequency[j] * frequency[i + j];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 }; 
        System.out.println(cointTriplets(arr));
    }

}