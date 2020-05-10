package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P4MultIntegers {
	
	public static List<Integer> multInteger(List<Integer> num1, List<Integer> num2) {
		int sign = num1.get(0) < 0 ^ num2.get(0) < 0 ? -1 : 1;
		num1.set(0, Math.abs(num1.get(0)));
		num2.set(0, Math.abs(num2.get(0)));
		List<Integer> result = new ArrayList<>(Collections.nCopies(num1.size() + num2.size(), 0));
		for(int i = num1.size() - 1; i >= 0; i--) {
			for(int j = num2.size() - 1; j >= 0; j--) {
				result.set(i + j + 1, result.get(i + j + 1) + num1.get(i) * num2.get(j));
				result.set(i + j + 1, result.get(i + j + 1) % 10);
				result.set(i + j, result.get(i + j) + result.get(i + j + 1) / 10);
			}
		}
		int firstNonZero = 0;
		while(firstNonZero < result.size() && result.get(firstNonZero) == 0)
			firstNonZero++;
		result = result.subList(firstNonZero, result.size());
		if(result.size() == 0)
			return Arrays.asList(0);
		result.set(0, result.get(0) * sign);
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> num1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> num2 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> result = multInteger(num1, num2);
		for(int n: result)
			System.out.print(n);
	}
}
