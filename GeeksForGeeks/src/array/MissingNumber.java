package array;

// Not to be confused with first missing positive
public class MissingNumber {
    public static int missingFormula(int[] nums) {
        int n = nums.length;
        int total = (n + 1) * (n + 2) / 2;
        for(int i = 0; i < n; i++)
            total -= nums[i];
        return total;
    }

    public static int missingXOR(int[] nums) {
        int n = nums.length;
        int a = 1, b = nums[0];
        for(int i = 2; i <= n + 1; i++)
            a ^= i;
        for(int i = 1; i < n; i++)
            b ^= nums[i];
        return (a^b);
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,5,6};
        System.out.println(missingFormula(nums));
        System.out.println(missingXOR(nums));
    }
}