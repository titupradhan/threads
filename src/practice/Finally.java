package practice;

public class Finally {

    public static void main(String[] args) throws Exception {
        Finally f = new Finally();
        f.go();

        final long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println(freeMemory + ":" + Thread.currentThread().getName());
        System.gc();
        final long freeMemory1 = Runtime.getRuntime().freeMemory();
        System.out.println(freeMemory1 + ":" + Thread.currentThread().getName());
        System.out.println((freeMemory1 - freeMemory) + ":" + Thread.currentThread().getName());


        Thread.sleep(5000);

    }

    public void go() {
        Person p = new Person();
        System.out.println(p.getWeight());
    }
}

class Person {

    private int weight = 10;

    public int getWeight() {
        return weight;
    }

    @Override
    public void finalize() {
        System.out.println("Finalize called...." + Thread.currentThread().getName());
    }
}
