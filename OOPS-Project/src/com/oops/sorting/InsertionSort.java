package com.oops.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {10,4,2,6,3,7,3,5,12};
		int len = arr.length;
		for(int i = 1; i < len; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		for(int n : arr)
			System.out.println(n);
	}
}
