package com.oops.algos;

public class ArrPlusOne {

	public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int result[] = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
	
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
		int arr2[] = {9};
		int arr3[] = {9, 9};
		int[] arr4 = plusOne(arr1);
		int[] arr5 = plusOne(arr2);
		int[] arr6 = plusOne(arr3);
		for(int n : arr4) {
			System.out.print(n);
		}
		System.out.println();
		for(int n : arr5) {
			System.out.print(n);
		}
		System.out.println();
		for(int n : arr6) {
			System.out.print(n);
		}
		System.out.println();
	}

}
