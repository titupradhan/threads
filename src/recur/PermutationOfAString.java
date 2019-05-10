package recur;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfAString {


    public static void main(String[] args) {
        final List<String> permutation = permutation("ABCD");
        System.out.println(permutation.size());
        permutation.forEach(s -> System.out.println(s));
    }

    static List<String> permutation(String str) {

        List<String> list = new ArrayList<>();
        permutation("", str, list);
        return list;
    }

    private static void permutation(String prefix, String suffix, List<String> list) {

        if (suffix.length() == 0) {
            list.add(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                permutation(prefix + suffix.charAt(i),
                        suffix.substring(0, i) + suffix.substring(i + 1, suffix.length()),
                        list);
            }
        }
    }
}
