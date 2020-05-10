package com.oops.algos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PermutationsArray {

	public List<int[]> permutation(int[] arr) {
		List<int[]> result = new ArrayList<>();
		allPermutations(arr, 0, result);
		return result;
	}
	
	public void allPermutations(int[] arr, int start, List<int[]> result) {
		if(start >= arr.length) {
			result.add(arr.clone());
			return;
		}
		for(int i = start; i < arr.length; i++) {
			swap(arr, start, i);
			allPermutations(arr, start + 1, result);
			swap(arr, start, i);
		}
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		PermutationsArray perm = new PermutationsArray();
		List<int[]> result = perm.permutation(new int[] {1, 2, 3});
		Iterator<int[]> i = result.listIterator();
		while(i.hasNext()) {
			int[] arr = i.next();
			for(int a:arr)
				System.out.print(a);
			System.out.println();
		}
	}

}
