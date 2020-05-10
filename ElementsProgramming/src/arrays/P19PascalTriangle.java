package arrays;

import java.util.ArrayList;
import java.util.List;

public class P19PascalTriangle {

	public static List<List<Integer>> pascal(int n) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
				}
			}
			result.add(row);
		}
		return result;
	}

	public static void main(String[] args) {
		List<List<Integer>> result = pascal(5);
		for (List<Integer> a : result) {
			for (int b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
