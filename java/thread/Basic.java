public class Basic {
    private static void showThreadInfo() {
        System.out.println(
                "new thread, id = " + Thread.currentThread().getId() + " name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(Basic::showThreadInfo).start();
        new Thread(Basic::showThreadInfo).start();
        new Thread(Basic::showThreadInfo).start();
    }
}
