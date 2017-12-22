public class WaitThread extends Thread {
    private volatile boolean fire = false;

    @Override
    public void run() {
        try {
            // wait notify 方法只能在 synchronized 代码块内被调用
            synchronized (this) {
                while (!fire) {
                    wait(); // 等待 
                }
            }
            System.out.println("fired");
        } catch (Exception e) {
        }
    }

    public synchronized void fire() {
        this.fire = true;
        notify(); // 从队列中移除并唤醒
    }

    public static void main(String[] args) throws InterruptedException {
        WaitThread waitThread = new WaitThread();
        waitThread.start();
        Thread.sleep(1000);
        System.out.println("fire");
        waitThread.fire();
    }
}