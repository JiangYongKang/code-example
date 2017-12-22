public class Racer extends Thread {
    FireFlag fireFlag;

    public Racer(FireFlag fireFlag) {
        this.fireFlag = fireFlag;
    }

    @Override
    public void run() {
        try {
            this.fireFlag.waitForFire();
            System.out.println("start run " + Thread.currentThread().getName());
        } catch (Exception e) {
        }
    }

    // 模拟运动员比赛，在枪响之前，所有运动员处于等待状态，枪响之后同时开始
    // 有一个主线程和十个子线程，每一个子线程模拟一个运动员，他们协作的共享变量是一个信号
    public static void main(String[] args) throws InterruptedException {
        int number = 10;
        FireFlag fireFlag = new FireFlag();
        Thread[] racers = new Thread[number];
        for (int i = 0; i < number; i++) {
            racers[i] = new Racer(fireFlag);
            racers[i].start();
        }
        Thread.sleep(3000);
        fireFlag.fire();
    }
}