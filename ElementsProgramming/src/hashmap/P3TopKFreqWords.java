package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class P3TopKFreqWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<String> heap = new PriorityQueue<>(
                (a, b) -> (map.get(a) == map.get(b) ? a.compareTo(b) : map.get(b) - map.get(a)));

        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        for (String n : map.keySet())
            heap.add(n);

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++)
            result.add(heap.poll());
        return result;
    }

    public static void main(String[] args) {
        P3TopKFreqWords top = new P3TopKFreqWords();
        String words[] = { "i", "love", "leetcode", "i", "love", "coding" };
        List<String> result = top.topKFrequent(words, 3);
        for (String word : result)
            System.out.println(word);
    }
}