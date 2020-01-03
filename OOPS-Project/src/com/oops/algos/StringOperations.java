package com.oops.algos;

import java.util.Vector;

public class StringOperations {
	public String solution(String S) {
        // write your code in Java SE 8
		Vector<Character> list = new Vector<>();
		for(int i = 0; i < S.length(); i++) {
			list.add(S.charAt(i));
			if(list.size() > 2) {
				int currentSize = list.size();
				if(list.get(currentSize - 1) == list.get(currentSize - 2) && list.get(currentSize - 2) == list.get(currentSize - 3)) {
					list.setSize(currentSize - 1);
				}
			}
		}
		String reqdString = "";
		for(int i = 0; i < list.size(); i++)
			reqdString += list.get(i);
		
		return reqdString;
    }
	
	public int magicSquare(int[][] A) {
        // write your code in Java SE 8
        int rows = A.length;
        int columns = A[0].length;
        System.out.println(columns);
		return rows;
    }
	
	public static void main(String args[]) {
		StringOperations ope = new StringOperations();
		int arr[][] = {{4,3,4,5,3}, {2,7,3,8,4}, {8,4,9,5,5}};
		ope.magicSquare(arr);
	}
}
