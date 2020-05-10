package arrays;

public class P13RandomPermutation {

	public static int[] randomPermutation(int n) {
		int[] perm = new int[n];
		for(int i = 0; i < n; i++) {
			perm[i] = i;
		}
		return P12RandomSampling.randomSampling(perm, n);
	}
	
	public static void main(String[] args) {
		int[] result = randomPermutation(4);
		for(int n: result)
			System.out.println(n);
	}
}
