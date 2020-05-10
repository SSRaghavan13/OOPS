package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class P14RandomSubset {

	// This differs from P12 as here n is large and there is no arr. Hence
	// storing arr of n number will be large and k << n.
	public static int[] genRandomSubset(int n, int k) {
		int result[] = new int[k];
		int i = 0;
		Map<Integer, Integer> map = new HashMap<>();
		Random random = new Random();
		while(i < k) {
			int temp = i + random.nextInt(n - i);
			System.out.println(temp);
			if(!map.containsKey(temp) || !map.containsValue(temp)) {
				map.put(temp, i);
				map.put(i, temp);
				result[i] = temp;
				i++;
			}
		}
		System.out.println(map);
		return result;
	}
	
	public static void main(String[] args) {
		int[] result = genRandomSubset(60, 4);
		for(int n: result)
			System.out.println(n);
	}

}
