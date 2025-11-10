public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        //devo fare un ciclo
    }

    public int getCount() {
        return count;
    }
}
