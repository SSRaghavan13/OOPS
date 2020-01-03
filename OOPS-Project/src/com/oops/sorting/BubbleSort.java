package com.oops.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {10,4,2,6,3,7,3,5,12};
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]){
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int n : arr)
			System.out.println(n);
	}
}
