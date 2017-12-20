public class Car {

    private static void echo() {
        System.out.println("thread name " + Thread.currentThread().getName() + "thread id " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(Car::echo).start();
        new Thread(Car::echo).start();
        new Thread(Car::echo).start();
        new Thread(Car::echo).start();
        Thread thread = new Thread(Car::echo);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        System.out.println(thread.getState());
        System.out.println(thread.getState());
    }
}
