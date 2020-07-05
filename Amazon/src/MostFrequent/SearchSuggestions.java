package MostFrequent;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SearchSuggestions {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        Arrays.sort(products);
        for(int i = 0; i < searchWord.length(); i++) {
            String searchStr = searchWord.substring(0, i + 1);
            List<String> list = new ArrayList<>();
            for(String product: products) {
                if(product.startsWith(searchStr) && list.size() < 3)
                    list.add(product);
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] products = new String[] {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        SearchSuggestions search = new SearchSuggestions();
        search.suggestedProducts(products, searchWord);
    }
}