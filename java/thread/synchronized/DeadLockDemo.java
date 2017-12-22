public class DeadLockDemo {
    private static Object lockA = new Object();
    private static Object lockB = new Object();

    public static void main(String[] args) throws Exception {
        new Thread(() -> {
            synchronized (lockA) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                synchronized (lockB) {
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (lockB) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                synchronized (lockA) {
                }
            }
        }).start();

        // 第一个线程持有锁 A 然后去请求锁 B
        // 第二个线程持有锁 B 然后去请求锁 A
        // 这样就造成了死锁
        // 可以再终端下输入 $ jps 查看进程 ID
        // 再输入 $ jstack xxx 来查看分析
        // 为了避免死锁，尽量不要在持有一个锁的同时去请求另一个锁
    }
}