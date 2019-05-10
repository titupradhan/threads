import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        /*Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T > 0) {
            int N = input.nextInt();
            System.out.println(reverse(N));
            T--;
        }*/

        int T, N;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        while (T-- > 0) {
            int d, r;
            d = 0;
            r = 0;
            N = in.nextInt();
            while (N > 0) {
                d = N % 10;
                r = r * 10 + d;
                N = N / 10;
            }
            System.out.println(r);
        }
    }

    public static int reverse(int no) {
        int rev = 0;
        while (no != 0) {
            int exp = (int) Math.log10(no);
            int rem = no % 10;
            rev += rem * Math.pow(10, exp);
            no /= 10;
        }
        return rev;
    }
}
