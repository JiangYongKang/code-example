public class FireFlag {
    private volatile boolean fired = false;

    // 枪响之前一直处于等待状态
    public synchronized void waitForFire() throws InterruptedException {
        while (!fired) {
            wait();
        }
    }

    // 枪响之后唤醒线程
    public synchronized void fire() {
        this.fired = true;
        notifyAll();
    }
}