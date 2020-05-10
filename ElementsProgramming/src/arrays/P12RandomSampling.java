package arrays;

import java.util.Arrays;
import java.util.Random;

public class P12RandomSampling {

	public static int[] randomSampling(int arr[], int k) {
		Random random = new Random();
		for(int i = 0; i < k; i++) {
			swap(arr, i, i + random.nextInt(arr.length - i));
		}
		return Arrays.copyOfRange(arr, 0, k);
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,2,3,4,5,6,6,7};
		int result[] = randomSampling(arr, 4);
		for (int a : result)
			System.out.println(a);
	}

}