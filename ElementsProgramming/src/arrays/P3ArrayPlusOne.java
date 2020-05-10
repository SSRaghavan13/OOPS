package arrays;

import java.util.ArrayList;
import java.util.List;

public class P3ArrayPlusOne {

	public static int[] arrPlusOne(int[] arr) {
		int carry = 0;
		int newArr[] = new int[arr.length + 1];
		newArr[0] = 1;
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] == 9) {
				arr[i] = 0;
				carry = 1;
			}
			else if(i == arr.length - 1) {
				arr[i] += 1;
			}
			else {
				arr[i] = arr[i] + carry;
				carry = 0;
			}
		}
		return (carry == 1) ? newArr : arr;
	}
	
	public static int[] plusOne(int[] digits) {
		for(int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}
	
	public static List<Integer> plusOne(List<Integer> list) {
		int last = list.size() - 1;
		list.set(last, list.get(last) + 1);
		for(int i = last; i > 0 && list.get(i) == 10; i--) {
			list.set(i, 0);
			list.set(i - 1, list.get(i - 1) + 1);
		}
		if(list.get(0) == 10) {
			list.set(0, 0);
			list.add(0, 1);
		}
		return list;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int result[] = plusOne(arr);
		for (int a : result)
			System.out.println(a);
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(9);
		list.add(9);
		list = plusOne(list);
		for(int n: list)
			System.out.println(n);
	}

}
