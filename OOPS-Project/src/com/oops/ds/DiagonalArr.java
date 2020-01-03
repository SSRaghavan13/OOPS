package com.oops.ds;

public class DiagonalArr {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int rows = arr.length;
		int columns = arr[0].length;
		int i = 0, j = 0, k, l;
		for(k = 0; k < rows; k++) {
			i= k;
			j = 0;
			while(i >= 0) {
				System.out.print(arr[i][j]);
				i -= 1;
				j += 1;
			}
			System.out.println();
		}
		for(l = 1; l < columns; l++) {
			i = rows - 1;
			j = l;
			while (j < columns) {
				System.out.print(arr[i][j]);
				i -= 1;
				j += 1;
			}
			System.out.println();
		}
	}

}
