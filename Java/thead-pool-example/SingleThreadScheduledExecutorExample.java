import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadScheduledExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> System.out.println(Thread.currentThread()));
        }
        executorService.shutdown();
    }
}