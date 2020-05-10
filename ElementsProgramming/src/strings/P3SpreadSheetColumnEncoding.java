package strings;

public class P3SpreadSheetColumnEncoding {

	public static void columnEncoding(String colId) {
		int result = 0;
		for(int i = 0; i < colId.length(); i++) {
			result = result * 26 + colId.charAt(i) - 'A' + 1;
		}
		System.out.println("String to int " + result);
	}
	
	public static String columnEncoding(int n) {
		return n == 0 ? "" : columnEncoding(n / 26) + (char) (n % 26 + 'A' - 1);
	}
	
	public static void main(String[] args) {
		columnEncoding("ZZ");
		System.out.println(columnEncoding(26));
	}

}
