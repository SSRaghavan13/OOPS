package com.oops.algos;

import java.util.ArrayList;
import java.util.List;

public class PermutationsString {
	
	public List<String> permutation(String arr) {
		List<String> result = new ArrayList<>();
		allPermutations("", arr, result);
		return result;
	}
	
	public void allPermutations(String prefix, String suffix, List<String> result) {
		if(suffix.length() == 0) {
			result.add(prefix);
			return;
		}
		for(int i = 0; i < suffix.length(); i++)
			allPermutations(prefix + suffix.charAt(i), suffix.substring(0, i) + 
					suffix.substring(i + 1, suffix.length()), result);
	}

	public static void main(String[] args) {
		PermutationsString perm = new PermutationsString();
		System.out.println(perm.permutation("abc"));
	}

}
