package arrays;

public class FindTwoUniqueInArray {
    
    public static int [] findTheUniqueNumbers(int[] nums) {

        int result = 0;
        int first = 0;
        int second = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        int count = 0;

        while (result%2!=1){
            result = result>>1;
            count += 1;
        }

        for(int i = 0; i < nums.length; i++) {
            if ((nums[i]>>count)%2==1){
                first ^= nums[i];
            }
            else{
                second ^= nums[i];
            }
        }
        return new int[] {first, second};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,4,3};
        int[] result = findTheUniqueNumbers(nums);
        for(int num: result)
            System.out.println(num);
    }

}