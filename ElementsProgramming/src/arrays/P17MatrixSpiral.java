package arrays;

public class P17MatrixSpiral {

	public static void matrixSpiral(int[][] arr) {
		int top = 0, bottom = arr.length - 1, left = 0, right = arr[0].length - 1;
		while (left <= right && top <= bottom) {
			for (int i = left; i <= right; i++) {
				System.out.println(arr[top][i]);
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				System.out.println(arr[i][right]);
			}
			right--;
			for (int i = right; i >= left; i--) {
				System.out.println(arr[bottom][i]);
			}
			bottom--;
			for (int i = bottom; i >= top; i--) {
				System.out.println(arr[i][left]);
			}
			left++;
		}
	}

	public static void main(String[] args) {
		matrixSpiral(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
	}

}
