package arrays;

public class P2DutchPartitioning {

	public static int[] dutchPartition(int[] arr, int pivotIndex) {
		int smaller = 0, larger = arr.length - 1, equal = 0;
		int pivot = arr[pivotIndex];
		while(equal <= larger) {
			if(arr[equal] < pivot)
				swap(arr, equal++, smaller++);
			else if(arr[equal] == pivot)
				equal++;
			else
				swap(arr, equal, larger--);
		}
		return arr;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 0, 2, 1, 1 };
//		int[] arr = {2,6,5,2,6,8,6,1,2,6};
		int result[] = dutchPartition(arr, 0);
		for (int a : result)
			System.out.println(a);
	}

}
