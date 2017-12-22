public class Producer extends Thread {
    MyBlockingQueue<String> queue;

    public Producer(MyBlockingQueue<String> queue) {
        this.queue = queue;
    }

    // 生产者，不停的往队列中放数据，每次间隔 3 秒钟
    @Override
    public void run() {
        int num = 0;
        try {
            while (true) {
                String task = String.valueOf(num);
                queue.put(task);
                System.out.println("produce task " + task);
                num++;
                Thread.sleep(3000);
            }
        } catch (Exception e) {
        }
    }

    static class Consumer extends Thread {
        MyBlockingQueue<String> queue;

        public Consumer(MyBlockingQueue<String> queue) {
            this.queue = queue;
        }

        // 消费者，不停的从队列中取数据，每隔 3 秒钟取一次
        @Override
        public void run() {
            try {
                while (true) {
                    String task = queue.take();
                    System.out.println("handle task " + task);
                    Thread.sleep(3000);
                }
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        MyBlockingQueue<String> queue = new MyBlockingQueue<>(10);
        // 模拟生产者和消费者，这里的生产者和消费者数量可以调整，达到让队列满或者空的目的
        new Producer(queue).start();
        new Consumer(queue).start();
    }
}