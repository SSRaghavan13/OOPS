package com.oops.ds;

import java.util.ArrayList;
import java.util.List;

public class ArrSpiral {

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3}, { 4, 5, 6 }, { 7, 8, 9}};
		//int result[] = new int[(matrix.length) * (matrix[0].length)];
		List<Integer> resultList = new ArrayList<>();
		int i = 0;
		int minRow = 0, maxRow = matrix.length, minCol = 0, maxCol = matrix[0].length;
		while(minCol < maxCol && minRow < maxRow) {
			//Left to Right
			for(i = minCol; i < maxCol; i++) {
				System.out.println(matrix[minRow][i]);
				resultList.add(matrix[minRow][i]);
			}
			minRow++;
			//Top to Bottom
			for(i = minRow; i < maxRow; i++) {
				System.out.println(matrix[i][maxCol - 1]);
				resultList.add(matrix[i][maxCol - 1]);
			}
			maxCol--;
			// Print the last row from the remaining rows */ 
			if(minRow < maxRow) {
				//Right to Left
				for(i = maxCol - 1; i >= minCol; i--) {
					System.out.println(matrix[maxRow - 1][i]);
					resultList.add(matrix[maxRow - 1][i]);
				}
				maxRow--;
			}
			// Print the first column from the remaining columns */
			if(minCol < maxCol) {
				//Bottom to Top
				for(i = maxRow - 1; i >= minRow; i--) {
					System.out.println(matrix[i][minCol]);
					resultList.add(matrix[i][minCol]);
				}
				minCol++;
			}
		}
		/*for(i = 0; i < resultList.size(); i++) {
			result[i] = resultList.get(i); 
		}*/
	}

}
