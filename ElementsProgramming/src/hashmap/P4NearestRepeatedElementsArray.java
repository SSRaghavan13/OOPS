package hashmap;

import java.util.HashMap;
import java.util.Map;

public class P4NearestRepeatedElementsArray {
    public static String nearestRepeatedEntryArray(String[] words) {
        Map<String, Integer> firstMap = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            if(firstMap.containsKey(words[i]) && !map.containsKey(words[i])) {
                map.put(words[i], i - firstMap.get(words[i]));
                firstMap.remove(words[i]);
            }
            else if(!firstMap.containsKey(words[i]) && !map.containsKey(words[i]))
                firstMap.put(words[i], i);
            else if(!firstMap.containsKey(words[i]) && map.containsKey(words[i])) {
                map.put(words[i], Math.min(map.get(words[i]), i - map.get(words[i])));
            }
        }        
        int minDistance = Integer.MAX_VALUE;
        String result = "";
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if(entry.getValue() < minDistance) {
                minDistance = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static int nearestRepeatedDistance(String words[]) {
        Map<String, Integer> map = new HashMap<>();
        int distance = Integer.MAX_VALUE;
        for(int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i])) {
                distance = Math.min(distance, map.get(words[i]));
            }
            map.put(words[i], i);
        }
        return distance;
    }

    public static void main(String[] args) {
        String words[] = {"All", "work", "and", "no", "play",
        "makes", "for", "no", "work", "no", "fun", "and", "no", "results"};
        System.out.println(nearestRepeatedEntryArray(words));
        System.out.println(nearestRepeatedDistance(words));
    }
}