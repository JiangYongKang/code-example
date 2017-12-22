import java.util.ArrayList;
import java.util.List;

public class ShareMemoryDemo {
    private static int shard = 0; // 被多个线程共享的变量

    private static void incrShard() {
        shard++;
    }

    static class ChildThread extends Thread {
        List<String> list;

        public ChildThread(List<String> list) {
            this.list = list;
        }

        @Override
        public void run() {
            incrShard(); // 操作共享变量
            list.add(Thread.currentThread().getName()); // 在共享的集合中添加元素
        }
    }

    // 当多个线程执行相同的代码时，每个线程都有自己单独的栈
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>(); // 被多个线程共享的变量

        Thread t1 = new ChildThread(list);
        Thread t2 = new ChildThread(list);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(shard);
        System.out.println(list);

        // output:
        // 2
        // [Thread-0, Thread-1]
    }
}