package arrays;

import java.util.ArrayList;
import java.util.List;

public class P9GeneratePrimes {

	public static List<Integer> genPrimes(int n) {
		List<Integer> primes = new ArrayList<>();
		boolean[] isPrime = new boolean[n + 1];
		for(int i = 2; i < n + 1; i++) {
			isPrime[i] = true;
		}
		for(int i = 2; i < n + 1; i++) {
			if(isPrime[i]) {
				primes.add(i);
				for(int j = i + i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		return primes;
	}
	
	public static void main(String[] args) {
		List<Integer> result = genPrimes(10);
		for (int a : result)
			System.out.println(a);
	}
	
}
