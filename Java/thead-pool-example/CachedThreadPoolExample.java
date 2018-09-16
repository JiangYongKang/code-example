import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            cachedThreadPool.execute(() -> System.out.println(Thread.currentThread()));    
        }
        cachedThreadPool.shutdown();
    }
}