package strings;

public class P12RunLengthEncoding {

	public static String encodingRLE(String s) {
		int count = 1;
		String str = "";
		for(int i = 1; i <= s.length(); i++) {
			if(i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
				str += String.valueOf(count) + s.charAt(i - 1);
				count = 1;
			}
			else {
				count++;
			}
		}
		return str;
	}
	
	public static String rle(String s) {
		int count = 1;
		String str = "";
		for(int i = 0; i < s.length() - 1; i++) {
			count = 1;
			int jVal = i + 1;
			for(int j = i + 1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j))
					count++;
				else {
					jVal = j;
					break;
				}
			}
			str += String.valueOf(count) + s.charAt(i);
			i = jVal - 1;
		}
		return str;
	}
	
	public static String decodingRLE(String s) {
		String str = "";
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				count = count * 10 + c - '0';
			}
			else {
				while(count > 0) {
					str += c;
					count--;
				}
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		String encoded = encodingRLE("aaaabcccaa");
		System.out.println(encoded);
		String decoded = decodingRLE(encoded);
		System.out.println(decoded);
	}

}
