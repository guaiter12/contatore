
public class Main {
    public static void main(String[] args) {
        CounterSynchronized c1 = new CounterSynchronized();
        Counter c2 = new Counter();



        Thread t1 = new Thread(() -> c1.increment());
        Thread t2 = new Thread(() -> c1.increment());
        Thread t3 = new Thread(() -> c2.increment());
        Thread t4 = new Thread(() -> c2.increment());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

