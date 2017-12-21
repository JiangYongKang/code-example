public class Counter {
  private int count;

  // synchronized 使多个线程同时只能有一个线程进入该方法
  // 但是仅限于同一个对象，不同对象的方法是不会被保护的
  public synchronized void incr() {
    count++;
  }

  // synchronized 可以用于修饰类的实例方法、静态方法和代码块
  public synchronized int getCount() {
    return count;
  }
}