public class InterruptRunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
            }
            System.out.println("done!");
        });
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}