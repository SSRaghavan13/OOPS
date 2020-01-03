package com.oops.ds;

import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {

	public static void main(String[] args) {
		boolean goingUp = true;
		int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int result[][] = new int [matrix.length][matrix[0].length];
		List<Integer> resultList = new ArrayList<>();
        int i = 0, j = 0, k, l;
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(k = 0; k < rows; k++) {
            if(goingUp) {
                i = k;
                j = 0;
                while(i >= 0) {
                    System.out.print(matrix[i][j]);
                    resultList.add(matrix[i][j]);
                    i -= 1;
                    j += 1;
                }
                System.out.println();
            }
            else {
                i = 0;
                j = k;
                while(j >= 0) {
                    System.out.print(matrix[i][j]);
                    resultList.add(matrix[i][j]);
                    i += 1;
                    j -= 1;
                }
                System.out.println();
            }
            goingUp = !goingUp;
        }
        for(l = 1; l < columns; l++) {
        	if(goingUp) {
        		i = rows - 1;
        		j = l;
        		while(j < columns) {
        			System.out.print(matrix[i][j]);
        			resultList.add(matrix[i][j]);
        			i -= 1;
        			j += 1;
        		}
        		System.out.println();
        	}
        	else {
        		i = l;
        		j = rows - 1;
        		while(i < columns) {
        			System.out.print(matrix[i][j]);
        			resultList.add(matrix[i][j]);
        			i += 1;
        			j -= 1;
        		}
        		System.out.println();
        	}
        	goingUp = !goingUp;
        }
        int resultArr[] = new int[resultList.size()];
        for (int y =0; y < resultList.size(); y++) 
            resultArr[y] = resultList.get(y); 
        
        for(int num : resultArr) {
        	System.out.println(num);
        }
	}
}
