package strings;

public class P2BaseConverter {

	public static String convertBase(String input, int b1, int b2) {
		boolean isNegative = input.startsWith("-");
		int decimal = 0;
		for(int i = (isNegative) ? 1 : 0; i < input.length(); i++) {
			decimal *= b1;
			decimal += (Character.isDigit(input.charAt(i)) ? input.charAt(i) - '0' : input.charAt(i) - 'A' + 10);
		}
		return (isNegative ? "-" : "") + (decimal == 0 ? "0" : convertBase(decimal , b2));
	}
	
	public static String convertBase(int input, int b) {
		return input == 0 ? "" :
			convertBase(input / 10, b) + (char) (input % b >= 10 ? input % 10 + 'A' - 10 : input % 10 + '0');
	}
	
	public static void main(String[] args) {
		System.out.println(convertBase("100", 2, 16));
	}

}
