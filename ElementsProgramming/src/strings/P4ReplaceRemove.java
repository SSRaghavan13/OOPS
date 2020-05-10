package strings;

public class P4ReplaceRemove {

	public static void replaceRemove(char[] arr, int size) {
		int writeIndex = 0, aCount = 0;
		for(int i = 0; i < size; i++) {
			if(arr[i] != 'b') {
				arr[writeIndex++] = arr[i];
			}
			if(arr[i] == 'a') {
				aCount++;
			}
		}
		int currSize = writeIndex - 1;
		writeIndex = writeIndex + aCount - 1;
		while(currSize >= 0) {
			if(arr[currSize] == 'a') {
				arr[writeIndex--] = 'd';
				arr[writeIndex--] = 'd';
			}
			else {
				arr[writeIndex--] = arr[currSize];
			}
			currSize--;
		}
		for(char c: arr)
			System.out.println(c);
	}
	
	public static void main(String[] args) {
		char[] arr = new char[100];
		arr[0] = 'a';
		arr[1] = 'b';
		arr[2] = 'a';
		arr[3] = 'c';
		replaceRemove(arr, 4);
	}

}
