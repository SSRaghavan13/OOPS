package arrays;

public class P5ReachArrayEnd {

	public static boolean reachArrayEnd(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			max = Math.max(max, i + arr[i]);
			if(max <= i)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,0,0,2,0,1};
		System.out.println(reachArrayEnd(arr));
	}

}
