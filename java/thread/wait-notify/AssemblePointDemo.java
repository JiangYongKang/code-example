public class AssemblePointDemo {
    static class Tourist extends Thread {
        AssemblePoint assemblePoint;

        public Tourist(AssemblePoint assemblePoint) {
            this.assemblePoint = assemblePoint;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
                assemblePoint.await();
                System.out.println("arrived");
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        int number = 10;
        Tourist[] threads = new Tourist[number];
        AssemblePoint assemblePoint = new AssemblePoint(number);
        for (int i = 0; i < number; i++) {
            threads[i] = new Tourist(assemblePoint);
            threads[i].start();
        }
    }
}