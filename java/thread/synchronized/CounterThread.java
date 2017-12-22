public class CounterThread extends Thread {
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 10));
        } catch (Exception e) {
            e.printStackTrace();
        }
        counter.incr();
    }

    public static void main(String[] args) throws Exception {
        int num = 100;
        Counter counter = new Counter();
        Thread[] threads = new Thread[num];
        // 无论执行多少次，总和永远是 100
        // 前提是保证是同一个对象，不同对象的被 synchronized 修饰的方法是不会被保护的。
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread(counter);
            threads[i].start();
        }
        for (int i = 0; i < num; i++) {
            threads[i].join();
        }
        System.out.println(counter.getCount());
    }
}