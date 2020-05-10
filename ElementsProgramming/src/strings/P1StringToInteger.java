package strings;

public class P1StringToInteger {

	public static int stringToInt(String str) {
		int result = 0;
		for(int i = str.charAt(0) == '-' ? 1 : 0; i < str.length(); i++) {
			result = result * 10 + str.charAt(i) - '0';
		}
		return str.charAt(0) == '-' ? -result : result;
	}
	
	public static String intToString(int num) {
		boolean isNegative = false;
		if(num < 0)
			isNegative = true;
		StringBuilder str = new StringBuilder();
		while(num > 0) {
			str.append((char)(num % 10 + '0'));
			num /= 10;
		}
		if(isNegative)
			str.append('-');
		str.reverse();
		return str.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(stringToInt("12345"));
		System.out.println(intToString(12345));
	}

}
