public class CounterThread extends Thread {
    private static int counter = 0; // 共享变量

    @Override
    public void run() {
        // 把共享变量自增 1000
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }

    public static void main(String[] args) throws Exception {
        int num = 1000;
        Thread[] threads = new Thread[num];
        // 循环创建 1000 个线程并启动，按道理讲执行完毕之后，共享变量 counter 的值应该是 100,0000
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread();
            threads[i].start();
        }

        for (int i = 0; i < num; i++) {
            // 有可能我自己定义的 1000 个线程还没有做完事情，主线程 main 却先退出了，所以可以使用 join 方法，让调用 join 的线程等待该线程结束
            threads[i].join();
        }

        // 但是最终的输出结果却不一定是 100,0000
        // 因为 counter++ 这个操作并不是原子性的，它分三步操作:
        // 取值、加一、赋值
        // 所以有时候会有两个线程同时拿到了值，然后自增赋值，结果值却只增加了一
        System.out.println(counter);
    }
}