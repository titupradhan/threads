package jan13;

public class Power {

    static double pow(double x, int n) {
        if (n == 0) return 1.0;
        double d = pow(x, n / 2);
        if (n % 2 == 0) return d * d;
        if (n < 0) return d * d * (1 / x);
        return d * d * x;
    }

    public static void main(String[] args) {
        System.out.println(pow(3, 3));
    }
}
