package com.oops.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> reqdList = new ArrayList<>();
		List<Integer> prevRow = new ArrayList<>();
		List<Integer> currentRow = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
        	currentRow.clear();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    currentRow.add(1);
                }
                else {
                	currentRow.add((prevRow.get(j - 1) + prevRow.get(j)));
                } 
            }
            //prevRow = currentRow;
            prevRow.clear();
            for(Integer num : currentRow)
            {
            	prevRow.add(num);
            }
            List<Integer> addRow = new ArrayList<>(prevRow);
            reqdList.add(addRow);
        }
        System.out.println("----------------------");
        for(List item : reqdList) {
        	System.out.print(item + " ");
        }
	}

}
