public class Worker extends Thread {
    MyLatch myLatch;

    public Worker(MyLatch myLatch) {
        this.myLatch = myLatch;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            this.myLatch.countDown();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int wokerNumber = 100;
        MyLatch latch = new MyLatch(wokerNumber);
        Worker[] workers = new Worker[wokerNumber];
        for (int i = 0; i < wokerNumber; i++) {
            workers[i] = new Worker(latch);
            workers[i].start();
        }
        latch.await();
        System.out.println("collect worker results");
    }
}