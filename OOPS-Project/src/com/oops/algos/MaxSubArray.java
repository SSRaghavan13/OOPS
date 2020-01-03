package com.oops.algos;

public class MaxSubArray {

	public static int[] bruteForce(int[] arr) {
		int start = 0;
		int end = 0;
		int diffArr[] = new int[arr.length - 1];
		int max = diffArr[0];
		int sum = 0;
		int i, j;
		for(i = 0; i < diffArr.length; i++)
			diffArr[i] = arr[i + 1] - arr[i];
		
		for(i = 0; i < diffArr.length; i++) {
			sum = 0;
			for(j = i; j < diffArr.length; j++) {
				sum += diffArr[j];
				if(sum > max) {
					start = i;
					end = j;
					max = sum;
				}
			}
		}
		end++;
		return new int[] {start, end};
	}
	
	public static int[] divideConquer(int[] arr, int left, int right) {
		int max;
		if(left == right)
			return new int[] {left, right, arr[left]};
		int m = (left + right) / 2;
		int[] leftMaxSum = divideConquer(arr, left, m);
		int[] rightMaxSum = divideConquer(arr, m + 1, right);
		int[] maxCrossingSum = maxCrossingArray(arr, left, m, right);
		max = Math.max(leftMaxSum[2], Math.max(rightMaxSum[2], maxCrossingSum[2]));
		if(leftMaxSum[2] == max)
			return leftMaxSum;
		else if(rightMaxSum[2] == max)
			return rightMaxSum;
		else
			return maxCrossingSum;
			
	}
	
	public static int[] maxCrossingArray(int[] arr, int left, int mid, int right) {
		int leftIndex = 0, rightIndex = 0;
		int leftSum = 0;
		int rightSum = 0;
		int sum = 0;
		int i = mid;
		while (i >= left) {
			sum += arr[i];
			if(sum > leftSum) {
				leftSum = sum;
				leftIndex = i;
			}
			i--;
		}
		sum = 0;
		i = mid + 1;
		while(i <= right) {
			sum += arr[i];
			if(sum > rightSum) {
				rightSum = sum;
				rightIndex = i;
			}
			i++;
		}
		return new int[] {leftIndex, rightIndex, leftSum + rightSum};
	}
	
	public static int[] kadaneAlgorithm(int[] arr) {
		int diffArr[] = new int[arr.length - 1];
		for(int i = 0; i < diffArr.length; i++)
			diffArr[i] = arr[i + 1] - arr[i];
		int left = 0, right = 0, start = 0, end = 0, currentMax = 0, max = 0;
		for(int i = 0; i < diffArr.length; i++) {
			if(diffArr[i] > diffArr[i] + currentMax) {
				currentMax = diffArr[i];
				start = i;
				end = i;
			}
			else {
				currentMax += diffArr[i];
				end = i;
			}
			if(currentMax > max) {
				max = currentMax;
				left = start;
				right = end;
			}
		}
		return new int[] {left, right};
	}
	
	public static int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int max = 0, maxSoFar = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maxSoFar + nums[i]) {
                maxSoFar = nums[i];
            }
            else {
                maxSoFar += nums[i];
            }
            if(maxSoFar > max) {
                max = maxSoFar;
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		int arr[] = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
		int diffArr[] = new int[arr.length - 1];
		for(int i = 0; i < diffArr.length; i++) {
			diffArr[i] = arr[i + 1] - arr[i];
		}
		int[] newArr = {1, -4, 3, 2};
		int reqdArr[] = divideConquer(newArr, 0, newArr.length - 1);
		System.out.println(reqdArr[0] + ", " + reqdArr[1] + ", " + reqdArr[2]);
		int []nums = {1,2};
		System.out.println(maxSubArray(nums));
	}
}
