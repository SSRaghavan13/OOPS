package arrays;

import java.util.Arrays;

public class P6RemoveDuplicates {
	
	public static int[] removeDuplicated(int[] arr) {
		int curr = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i - 1]) {
				arr[curr++] = arr[i];
			}
		}
		return Arrays.copyOfRange(arr, 0, curr);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,2,3,4,5,6,6,7};
		int result[] = removeDuplicated(arr);
		for (int a : result)
			System.out.println(a);
	}
}
