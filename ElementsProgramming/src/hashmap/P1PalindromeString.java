package hashmap;

import java.util.HashMap;
import java.util.Map;

public class P1PalindromeString {
    public static boolean canFormPalindrome(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        int numOdd = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                numOdd++;
            }
        }
        return numOdd < 2 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(canFormPalindrome("foobaraboof"));
        System.out.println(canFormPalindrome("abcdcb"));
    }
}