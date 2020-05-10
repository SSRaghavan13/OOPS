package strings;

public class P11WriteSinusoidally {

	public static String sinusoidally(String s) {
		String str = "";
		for(int i = 1; i < s.length(); i += 4) {
			str += s.charAt(i);
		}
		for(int i = 0; i < s.length(); i += 2) {
			str += s.charAt(i);
		}
		for(int i = 3; i < s.length(); i += 4) {
			str += s.charAt(i);
		}
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(sinusoidally("Hello World!"));
	}

}
