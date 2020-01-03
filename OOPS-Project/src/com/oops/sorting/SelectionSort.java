package com.oops.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {10,4,2,6,3,7,3,5,12};
		for(int i = 0; i < arr.length; i++) {
			int min_idx = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min_idx])
					min_idx = j;
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		for(int n : arr)
			System.out.println(n);
	}
}
