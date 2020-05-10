package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class P15NonUniformRandomNumber {

	public static int nonUniformRandom(double[] prob, int[] values) {
		List<Double> probList = new ArrayList<>();
		probList.add(0.0);
		for(double p: prob)
			probList.add(probList.get(probList.size() - 1) + p);
		Random random = new Random();
		double randomNum = random.nextDouble();
		int search = Collections.binarySearch(probList, randomNum);
		if(search < 0) {
			return values[(Math.abs(search) - 1) - 1];
		}
		else
			return values[search];
	}
	
	public static void main(String[] args) {
		System.out.println(nonUniformRandom(new double[]{0.23, 0.27, 0.15, 0.20, 0.10, 0.5}, new int[]{1,2,3,4,5,6}));
	}

}
