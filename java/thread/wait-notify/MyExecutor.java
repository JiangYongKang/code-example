import java.util.concurrent.Callable;

public class MyExecutor<V> {
    public <V> MyFuture<V> execute(final Callable<V> task) {
        final Object lock = new Object();
        final ExecuteThread<V> thread = new ExecuteThread<>(task, lock);
        thread.start();

        MyFuture<V> future = new MyFuture<V>() {

            @Override
            public V get() throws Exception {
                synchronized (lock) {
                    while (!thread.isDone()) {
                        try {
                            lock.wait();
                        } catch (Exception e) {
                        }
                    }
                    if (thread.getException() != null) {
                        throw thread.getException();
                    }
                    return thread.getResult();
                }
            }
        };
        return future;
    }

    // 总之关于这个异步回调很麻烦，没看懂，原文地址：https://juejin.im/post/58ae220f2f301e0068ecd61a
    public static void main(String[] args) {
        MyExecutor executor = new MyExecutor<>();
        Callable<Integer> subTask = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int millis = (int) (Math.random() * 1000);
                Thread.sleep(millis);
                return millis;
            }
        };

        MyFuture<Integer> future = executor.execute(subTask);

        try {
            Integer result = future.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}