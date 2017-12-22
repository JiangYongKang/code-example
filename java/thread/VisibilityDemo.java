public class VisibilityDemo {
    private static boolean shutdown = false;

    static class HelloThread extends Thread {
        @Override
        public void run() {
            while (!shutdown) {
            }
            System.out.println("exit hello");
        }
    }

    public static void main(String[] args) throws Exception {
        new HelloThread().start();
        // 预期的结果是 HelloThread 线程一直运行，等主线程 sleep 一秒钟后，
        // 会修改共享的布尔变量，然后 HelloThread 线程也停止运行
        Thread.sleep(1000);
        // 但是实际的结果是 HelloThread 一直没有退出
        // 这是内存可见性的问题
        // 因为访问一个变量的时候，不一定就去内存中取，有可能是从寄存器或者缓存中去拿
        // 写一个变量的时候，也有可能是先写入缓存，再写入内存中
        // 可以使用 volatile 关键字来修饰 shutdown 变量，或者使用显示同步锁
        // 加了volatile之后，Java会在操作对应变量时插入特殊的指令，保证读写到内存最新值，而非缓存的值。
        shutdown = true;
        System.out.println("exit main");
    }
}