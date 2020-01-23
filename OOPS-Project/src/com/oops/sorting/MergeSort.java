package com.oops.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums = {5, 2, 4, 2, 6, 3, 8};
		mergeSort(nums, 0, nums.length - 1);
		for(int n : nums)
			System.out.print(n + " ");
	}
	
	public static void mergeSort(int nums[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(nums, start, mid);
			mergeSort(nums, mid + 1, end);
			merge(nums, start, mid, end);
		}
	}

	public static void merge(int nums[], int start, int mid, int end) {
		int leftSize = mid - start + 1;
		int rightSize = end - mid;
		int leftArr[] = new int[leftSize];
		int rightArr[] = new int[rightSize];
		int i, j;
		for(i = 0; i < leftSize; i++)
			leftArr[i] = nums[start + i];
		for(i = 0; i < rightSize; i++)
			rightArr[i] = nums[mid + 1 + i];
		i = 0; j = 0;
		int k = start;
		while(i < leftSize && j < rightSize) {
			if(leftArr[i] < rightArr[j]) {
				nums[k] = leftArr[i];
				i++;
			}
			else {
				nums[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i < leftSize) {
			nums[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < rightSize) {
			nums[k] = rightArr[j];
			j++;
			k++;
		}
	}
}
