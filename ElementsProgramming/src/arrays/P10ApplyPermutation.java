package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P10ApplyPermutation {

	public static List<Character> applyPermutation(List<Integer> perm, List<Character> arr) {
		for(int i = 0; i < arr.size(); i++) {
			int next = i;
			while(perm.get(next) > 0) {
				Collections.swap(arr, i, perm.get(next));
				int temp = perm.get(next);
				perm.set(next, perm.get(next) - perm.size());
				next = temp;
			}
		}
		for (int i = 0; i < perm.size(); i++) {
			perm.set(i, perm.get(i) + perm.size());
		}
		return arr;
	}
	
	public static void main(String[] args) {
		List<Integer> perm = Arrays.asList(3,2,0,1);
		List<Character> arr = Arrays.asList('a','b','c','d');
		List<Character> result = applyPermutation(perm, arr);
		for(char c: result)
			System.out.println(c);
	}

}
