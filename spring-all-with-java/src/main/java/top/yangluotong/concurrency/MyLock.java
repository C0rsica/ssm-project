package top.yangluotong.concurrency;

public class MyLock {

    public static int count;

    public void add() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        thread1.setName("thread1");
        thread1.start();
        MyThread thread2 = new MyThread();
        thread2.setName("thread2");
        thread2.start();

        //start and run diff?

    }


}
