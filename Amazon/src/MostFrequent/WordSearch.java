package MostFrequent;

import java.util.ArrayList;
import java.util.List;

class Trie {
    Trie[] nodes = new Trie[26];
}

public class WordSearch {
    Trie root;
    boolean visited[][];
    public List<String> findWords(char[][] board, String[] words) {
        int rows = board.length;
        int cols = board[0].length;
        visited = new boolean[rows][cols];
        root = new Trie();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                dfsAdd(board, i, j, root);
            }
        }
        
        List<String> result = new ArrayList<>();
        for(String word : words) {
            if(checkPresent(root, word))
                result.add(word);
        }
        return result;
    }
    
    public void dfsAdd(char[][] board, int row, int col, Trie root) {
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col])
            return;
        visited[row][col] = true;
        Trie nextNode = addToTrie(root, board[row][col]);
        dfsAdd(board, row - 1, col, nextNode);
        dfsAdd(board, row + 1, col, nextNode);
        dfsAdd(board, row, col - 1, nextNode);
        dfsAdd(board, row, col + 1, nextNode);
        visited[row][col] = false;
    }
    
    public Trie addToTrie(Trie root, char c) {
        if(root.nodes[c - 'a'] == null) {
            root.nodes[c- 'a'] = new Trie();
        }
        return root.nodes[c - 'a'];
    }
    
    public boolean checkPresent(Trie root, String word) {
        char[] letters = word.toCharArray();
        Trie temp = root;
        for(char letter : letters) {
            if(temp.nodes[letter - 'a'] == null)
                return false;
            temp = temp.nodes[letter - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        WordSearch search = new WordSearch();
        char[][] board = {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };

        String[] words = {"oath","pea","eat","rain"};
        List<String> result = search.findWords(board, words);
        for(String word : result)
            System.out.println(word);

        char[][] board1 = {{'b','b','a','a','b','a'},{'b','b','a','b','a','a'},{'b','b','b','b','b','b'},{'a','a','a','b','a','a'},{'a','b','a','a','b','b'}};
        String word1[] = {"abbbababaa"};
        result = search.findWords(board1, word1);
        for(String word : result)
            System.out.println(word);
    }
}