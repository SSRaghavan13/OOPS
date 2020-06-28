package hashmap;

import java.util.HashMap;
import java.util.Map;

public class P2LetterFromMagazine {
    public static boolean isLetterConstructibleFromMagazine(String letter, String magazineText) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : letter.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : magazineText.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                    if(map.isEmpty())
                        break;
                }
            }
        }
        return map.isEmpty();
    }
}