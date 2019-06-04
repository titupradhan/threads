package recur;

public class GenerateValidParenthesis {


    public static void main(String[] args) {
        int left = 3, right = 3;
        String s = "";
        generateParenthesis(left, right, s);
    }


    private static void generateParenthesis(int open, int close, String s) {
        if (open == 0 && close == 0) {
            System.out.println(s);
        } else {
            if (open > 0) {
                generateParenthesis(open - 1, close, s + "(");
            }
            if (close > open) {
                generateParenthesis(open, close - 1, s + ")");
            }
        }
    }
}
