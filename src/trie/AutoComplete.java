package trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoComplete {

    private class Node {

        private String prefix;
        private boolean isWord;
        private Map<Character, Node> children;

        public Node(String prefix) {
            this.prefix = prefix;
            children = new HashMap<>();
        }
    }

    private Node trie;

    public AutoComplete(String[] dictionary) {
        trie = new Node("");
        for (String s : dictionary) {
            insertWord(s);
        }
    }

    private void insertWord(String s) {
        Node curr = trie;

        for (int i = 0; i < s.length(); i++) {
            final char currChar = s.charAt(i);
            if (!curr.children.containsKey(currChar)) {
                curr.children.put(currChar, new Node(s.substring(0, i + 1)));
            }
            curr = curr.children.get(currChar);
            if (i == s.length() - 1) {
                curr.isWord = true;
            }
        }
    }

    public List<String> getWordsForPrefix(String prefix) {
        List<String> words = new ArrayList<>();
        Node curr = trie;
        for (char c : prefix.toCharArray()) {
            if (curr.children.containsKey(c)) {
                curr = curr.children.get(c);
            } else {
                return words;
            }
        }
        findAllChildWords(curr,words);
        return words;
    }

    private void findAllChildWords(Node curr, List<String> words) {
        if (curr.isWord) words.add(curr.prefix);
        for (char c : curr.children.keySet()) {
            findAllChildWords(curr.children.get(c), words);
        }
    }
}
