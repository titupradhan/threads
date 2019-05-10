import java.util.concurrent.atomic.AtomicInteger;

public class Single {


    public Single() {
        System.out.println(Thread.currentThread());
        AtomicInteger i = new AtomicInteger(1);
    }

    public static void main(String[] args) {
        new Single();
        new Single();
    }


}
