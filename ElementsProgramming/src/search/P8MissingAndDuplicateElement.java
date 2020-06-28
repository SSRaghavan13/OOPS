package search;

public class P8MissingAndDuplicateElement {
    public static void duplicateAndMissing(int[] nums) {
        int xorAll = 0;
        int anticipatedXor = 0;
        for(int i = 0; i < nums.length; i++) {
            xorAll ^= nums[i];
            anticipatedXor ^= i;
        }
        int xorTwo = xorAll ^ anticipatedXor;
        int result = xorTwo;
        int count = 0;
        while(result % 2 == 0) {
            result = result >> 1;
            count++;
        }
        int missOrDup = 0;
        for(int i = 0; i < nums.length; i++) {
            if((i >> count) % 2 != 0) {
                missOrDup ^= i;
            }
            if((nums[i] >> count) % 2 != 0)
                missOrDup ^= nums[i];
        }
        boolean flag = false;
        for(int num: nums) {
            if(missOrDup == num) {
                System.out.println("Duplicate element is " + missOrDup + ", missing element is " + (xorTwo^missOrDup));
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("Duplicate element is " + (xorTwo^missOrDup) + ", missing element is " + (missOrDup));
    }

    public static void main(String[] args) {
        duplicateAndMissing(new int[] {5,4,0,4,1,2});
        duplicateAndMissing(new int[] {5,3,0,3,1,2});
    }
}