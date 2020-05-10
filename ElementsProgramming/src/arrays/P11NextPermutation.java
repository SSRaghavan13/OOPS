package arrays;

public class P11NextPermutation {

	public static int[] nextPermutation(int[] arr) {
		int i = arr.length - 2;
		while(i >= 0 && arr[i + 1] <= arr[i])
			i--;
		if(i <= 0)
			return new int[] {};
		int j = arr.length - 1;
		while(j >= 0 && arr[j] <= arr[i])
			j--;
		swap(arr, i, j);
		reverse(arr, i + 1);
		
		return arr;
	}
	
	public static void reverse(int[] arr, int i) {
		int j = i, k = arr.length - 1;
		while(j < k) {	
			swap(arr, j++, k--);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int arr[] = {0,1,3,2};
		int result[] = nextPermutation(arr);
		for (int a : result)
			System.out.println(a);
	}

}
