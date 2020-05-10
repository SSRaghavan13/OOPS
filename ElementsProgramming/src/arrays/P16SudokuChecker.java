package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P16SudokuChecker {

	public static boolean sudokuChecker(List<List<Integer>> partialSol) {
		// Check cols
		for(int i = 0; i < partialSol.size(); i++) {
			if(hasDuplicate(partialSol, 0, partialSol.size(), i, i + 1))
				return false;
		}
		
		// Check rows
		for(int i = 0; i < partialSol.size(); i++) {
			if(hasDuplicate(partialSol, i, i + 1, 0, partialSol.size()))
				return false;
		}
		
		// Check grids
		int regionSize = (int) Math.sqrt(partialSol.size());
		for(int i = 0; i < regionSize; i++) {
			for(int j = 0; j < regionSize; j++) {
				if(hasDuplicate(partialSol, regionSize * i, regionSize * (i + 1), regionSize * j, regionSize * (j + 1)))
					return false;
			}
		}
		
		return true;
	}
	
	public static boolean hasDuplicate(List<List<Integer>> partialSol, int rowStart, int rowEnd, int colStart, int colEnd) {
		List<Boolean> isPresent = new ArrayList<>(Collections.nCopies(partialSol.size() + 1, false));
		for(int i = rowStart; i < rowEnd; i++) {
			for(int j = colStart; j < rowEnd; j++) {
				if(partialSol.get(i).get(j) != 0 && isPresent.get(partialSol.get(i).get(j)))
					return true;
				isPresent.set(partialSol.get(i).get(j), true);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		List<Integer> row1 = new ArrayList<Integer>(Arrays.asList(5,3,0,0,7,0,0,0,0));
		List<Integer> row2 = new ArrayList<Integer>(Arrays.asList(6,0,0,1,9,5,0,0,0));
		List<Integer> row3 = new ArrayList<Integer>(Arrays.asList(0,9,8,0,0,0,0,6,0));
		List<Integer> row4 = new ArrayList<Integer>(Arrays.asList(8,0,0,0,6,0,0,0,3));
		List<Integer> row5 = new ArrayList<Integer>(Arrays.asList(4,0,0,8,0,3,0,0,1));
		List<Integer> row6 = new ArrayList<Integer>(Arrays.asList(7,0,0,0,2,0,0,0,6));
		List<Integer> row7 = new ArrayList<Integer>(Arrays.asList(0,6,0,0,0,0,2,8,0));
		List<Integer> row8 = new ArrayList<Integer>(Arrays.asList(0,0,0,4,1,9,0,0,5));
		List<Integer> row9 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,8,0,0,7,9));
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		arr.add(row4);
		arr.add(row5);
		arr.add(row6);
		arr.add(row7);
		arr.add(row8);
		arr.add(row9);
		System.out.println(sudokuChecker(arr));
	}
	
}
