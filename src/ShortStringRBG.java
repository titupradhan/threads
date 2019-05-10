public class ShortStringRBG {

    public static String makeSmall(String str) {
        int count = 0;
        int i;
        StringBuilder shortStr = new StringBuilder("");
        for (i = 0; i < str.length(); i++) {
            if (i == 0) {
                count++;
            } else {
                final char currChar = str.charAt(i);
                final char prevChar = str.charAt(i - 1);
                if (currChar != prevChar) {
                    shortStr.append(count).append(prevChar);
                    count = 1;
                } else {
                    count++;
                }
            }
        }

        if (i > 0) {
            shortStr.append(count).append(str.charAt(i - 1));
        }
        return shortStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeSmall(""));
        System.out.println(makeSmall("R"));
        System.out.println(makeSmall("GGBR"));
        System.out.println(makeSmall("RBG"));
        System.out.println(makeSmall("RRRBBBG"));
        System.out.println(makeSmall("RRRBBBGGGGGGG"));
    }
}
