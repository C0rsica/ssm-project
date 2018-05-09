package top.yangluotong.concurrency;

public class RunableThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println("runable test");
    }
}
