import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> System.out.println(Thread.currentThread()));
        }
        executorService.shutdown();
    }
}