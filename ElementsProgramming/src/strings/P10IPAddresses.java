package strings;

import java.util.ArrayList;
import java.util.List;

public class P10IPAddresses {

	public static List<String> validIP(String s) {
		List<String> result = new ArrayList<>();
		int len = s.length();
		if(len < 3 || len > 12)
			return result;
		String newStr = s;
		for(int i = 1; i < len - 2; i++) {
			for(int j = i + 1; j < len - 1; j++) {
				for(int k = j + 1; k < len; k++) {
					newStr = newStr.substring(0, k) + "." + newStr.substring(k);
                    newStr = newStr.substring(0, j) + "." + newStr.substring(j);
                    newStr = newStr.substring(0, i) + "." + newStr.substring(i);
					if(checkValid(newStr))
						result.add(newStr);
					newStr = s;
				}
			}
		}
		return result;
	}
	
	public static boolean checkValid(String s) {
		String[] strArr = s.split("[.]");
		for(String str: strArr) {
			int i = Integer.parseInt(str);
			if(str.length() > 3 || i < 0 || i > 255)
				return false;
			if(i > 0 && str.charAt(0) == '0')
				return false;
			if(str.length() > 1 && Integer.parseInt(str) == 0)
                return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		List<String> result = validIP("19216811");
		for(String s: result)
			System.out.println(s);
	}

}
