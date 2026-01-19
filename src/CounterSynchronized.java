public class CounterSynchronized {

    private int count = 0;

    public synchronized void increment() {
        for (int i = 0; i < 5000; i++) {
            count++;
        }
    }

    public synchronized int getCount() {
        return count;
    }
}
