import java.util.concurrent.ThreadLocalRandom;

public class OddEvenTest {

    public static void main(String[] args) {

        String lock = "";
        Runnable odd = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; ) {

                    synchronized (lock) {
                        try {
                            System.out.println(i + ":" + Thread.currentThread().getName());
                            i += 2;
                            if (i < 100)
                                lock.wait();
                            lock.notify();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        };

        Runnable even = new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i < 100; ) {
                    System.out.println(i + ":" + Thread.currentThread().getName());
                    synchronized (lock) {
                        try {
                            i += 2;
                            lock.notify();
                            if (i < 100)
                                lock.wait();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        };

        new Thread(odd, "odd").start();
        new Thread(even, "even").start();
    }
}
