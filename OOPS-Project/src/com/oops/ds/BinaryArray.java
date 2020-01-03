package com.oops.ds;

public class BinaryArray {
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                for(int j = i + 1; j < nums.length; j++) {
                    int consecutiveCount = count;
                    if(nums[j] == 1) {
                        consecutiveCount++;
                        max = (consecutiveCount > max) ? consecutiveCount : max;
                    }
                    else {
                        break;
                    }
                }
            }
            else {
                max = (count > max) ? count : max;
                count = 0;
            }
        }
        if(count == 1)
            max = (count > max) ? count : max;
        return max;
    }

	public static void main(String[] args) {
		int arr[] = {1,0};
		BinaryArray binaryArray = new BinaryArray();
		System.out.println(binaryArray.findMaxConsecutiveOnes(arr));
	}

}
