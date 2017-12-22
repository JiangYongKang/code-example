import java.util.ArrayDeque;
import java.util.Queue;

public class MyBlockingQueue<E> {
    private Queue<E> queue = null;
    private int limit;

    // 长度有限的队列，长度通过构造方法传递
    public MyBlockingQueue(int limit) {
        this.limit = limit;
        queue = new ArrayDeque<>(limit);
    }

    // 给生产者用的，往队列中放数据，满了就 wait
    public synchronized void put(E e) throws InterruptedException {
        while (queue.size() == limit) {
            wait();
        }
        queue.add(e);
        notify();
    }

    // 给消费者用的，从队列中取数据，空了就 wait
    public synchronized E take() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        E e = queue.poll();
        notifyAll();
        return e;
    }
}