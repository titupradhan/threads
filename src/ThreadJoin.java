import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException {


        Runnable r = () -> {

            IntStream.range(1, 20).forEach(i -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            });

        };

        Thread t = new Thread(r);
        t.start();
        t.join();
        System.out.println("Main End");

    }
}
