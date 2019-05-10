package recur;

public class RecursionEx {

    public static void main(String[] args) {

        System.out.println(factorial(4));
        reverse2("ASHOK".toCharArray(), 0);
        String name = "Monalisha";
        System.out.println();
        System.out.println(reverse(name, "", name.length() - 1));
    }

    static void print(int i) {
        if (i == 11) {
            return;
        }
        print(i + 1);
        System.out.println(i);
    }


    static int factorial(int n, int fact) {
        if (n == 1) {
            return fact;
        }
        return factorial(n - 1, fact * n);
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    static void reverse(char[] array, int i) {
        if (i == -1) {
            return;
        }
        System.out.print(array[i]);
        reverse(array, i - 1);

    }

    static void reverse2(char[] array, int i) {
        if (i == array.length) {
            return;
        }
        reverse2(array, i + 1);
        System.out.print(array[i]);

    }

    static String reverse(String str, String rev, int i) {
        if (i == -1) {
            return rev;
        }
        return reverse(str, rev + str.charAt(i), i - 1);
    }
}
