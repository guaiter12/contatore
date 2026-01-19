public class Counter {

    private int count = 0;

    public void increment() {
        for (int i = 0; i < 5000; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

