package thread;

public class OddEven {

    public static void main(String[] args) {

        OddEvenPrinter oddEvenPrinter = new OddEvenPrinter(1, true);

        OddThread odd = new OddThread(oddEvenPrinter);
        odd.setName("odd");
        EvenThread even = new EvenThread(oddEvenPrinter);
        even.setName("even");

        even.start();
        odd.start();

    }

}

class OddThread extends Thread {
    private OddEvenPrinter oddEvenPrinter;

    public OddThread(OddEvenPrinter oddEvenPrinter) {
        this.oddEvenPrinter = oddEvenPrinter;
    }

    public void run() {
        synchronized (oddEvenPrinter) {
            while (oddEvenPrinter.getNo() < 100) {
                try {
                    while (!oddEvenPrinter.isOdd()) {
                        oddEvenPrinter.wait();
                    }
                    oddEvenPrinter.print();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

class EvenThread extends Thread {
    private OddEvenPrinter oddEvenPrinter;

    public EvenThread(OddEvenPrinter oddEvenPrinter) {
        this.oddEvenPrinter = oddEvenPrinter;
    }

    public void run() {
        synchronized (oddEvenPrinter) {
            while (oddEvenPrinter.getNo() < 100) {
                try {
                    while (oddEvenPrinter.isOdd()) {
                        oddEvenPrinter.wait();
                    }
                    oddEvenPrinter.print();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

class OddEvenPrinter {

    private volatile int no;
    private volatile boolean odd;

    public OddEvenPrinter(int no, boolean odd) {
        this.no = no;
        this.odd = odd;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public boolean isOdd() {
        return odd;
    }

    public void setOdd(boolean odd) {
        this.odd = odd;
    }

    void print(){
        System.out.println(no +" "+Thread.currentThread().getName());
        no++;
        odd = !odd;
        notify();
    }
}


