import java.util.concurrent.TimeUnit;

public class LongThreadSafe {

    private long i = 0;

    void assignValue(long j) {
        i = j;
    }

    void printLong() {
        if(i != 987 && i!=0) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        final LongThreadSafe lt = new LongThreadSafe();

        Runnable r1 = () -> {
            for (int i = 1; i < 99900973; i++) {
                lt.assignValue(987);
            }
        };
        Runnable r2 = () -> {
            for (int i = 1; i < 99987328; i++) {
                lt.printLong();
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }

    private static void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(20);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
