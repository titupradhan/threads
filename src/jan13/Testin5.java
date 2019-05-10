package jan13;

public class Testin5 {
    public static void main(String[] args) {
        double k = Math.pow(1, 2) + Math.pow(9, 2);
        System.out.println(Math.sqrt(k));
    }

    static Pair closest(Pair[] array) {
        Pair pair = array[0];
        double closest = Math.sqrt(Math.pow(pair.x, 2) + Math.pow(pair.y, 2));

        for (int i = 1; i < array.length; i++) {
            double current = Math.sqrt(Math.pow(pair.x, 2) + Math.pow(pair.y, 2));
            if (current < closest) {
                pair = array[i];
            }
        }
        return pair;

    }

    static class Pair {
        public int x;
        public int y;
    }
}
