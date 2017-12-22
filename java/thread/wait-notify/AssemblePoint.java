public class AssemblePoint {
    private int number;

    public AssemblePoint(int number) {
        this.number = number;
    }

    public synchronized void await() throws InterruptedException {
        if (number > 0) {
            number--;
            if (number == 0) {
                notifyAll();
            } else {
                while (number != 0) {
                    wait();
                }
            }
        }
    }
}