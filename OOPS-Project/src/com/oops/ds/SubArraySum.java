package com.oops.ds;

public class SubArraySum {
	
	public int minSubArrayLen(int s, int[] nums) {
        int minIndex = 0, sum = 0;
        for(int i = 0; i < nums.length; i++) {
        	sum = 0;
            if(nums[i] >= s)
                minIndex = 1;
            else {
                sum += nums[i];
                for(int j = i + 1; j < nums.length; j++) {
                    sum += nums[j];
                    if(sum >= s) {
                        minIndex = (minIndex != 0 && minIndex < (j - i + 1)) ? minIndex : (j - i + 1);
                        break;
                    }
                }
            }
        }
        return minIndex;
    }

	public static void main(String[] args) {
		int arr[] = {5,1,3,5,10,7,4,9,2,8};
		SubArraySum subArraySum = new SubArraySum();
		System.out.println(subArraySum.minSubArrayLen(15, arr));
	}

}
