package com.oops.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
	public static void main(String args[]) {
		List<Integer> list;
		Integer[] a = {1, 2, 3, 4};
		list = new ArrayList<>(Arrays.asList(a));
		for(int var: list) {
			System.out.print(var + " ");
		}
		list.set(0,5);
		list.add(6);
		System.out.println();
		System.out.println(list.get(0));
		for(int var: list) {
			System.out.print(var + " ");
		}
	}
}
