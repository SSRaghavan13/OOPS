package arrays;

public class P1SeparateEvenodd {

	public static int[] separateEvenOdd(int[] arr) {
		int even = 0, odd = arr.length - 1;
		while(even < odd) {
			if(arr[even] % 2 == 0)
				even++;
			else {
				int temp = arr[even];
				arr[even] = arr[odd];
				arr[odd] = temp;
				odd--;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int result[] = separateEvenOdd(arr);
		for(int a: result)
			System.out.println(a);
	}

}
