package trie;

import java.util.Collections;
import java.util.List;

public class AutoCompleteTest {

    public static void main(String[] args) {


        String[] dictionary = {
                "ashok",
                "ashish",
                "asutosh",
                "ash",
                "mona",
                "micky",
                "monalisha",
                "manala",
                "bidya",
                "bapa",
                "baba"
        };
        AutoComplete autoComplete = new AutoComplete(dictionary);
        final List<String> names = autoComplete.getWordsForPrefix("b");
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
