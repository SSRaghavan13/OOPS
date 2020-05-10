package arrays;

public class P18RotateArray {

	private static int[][] rotateArray(int[][] arr) {
		int n = arr.length;
		for(int i = 0; i < n / 2; i++) {
			for(int j = 0; j < n / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[n - j - 1][i];
				arr[n - j - 1][i] = arr[n - i - 1][n - j - 1];
				arr[n - i - 1][n - j - 1] = arr[j][n - i - 1];
				arr[j][n - i - 1] = temp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[][] result = rotateArray(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
		for(int[] a: result) {
			for(int b: a) {
				System.out.println(b);
			}
		}
	}

}
