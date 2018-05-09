package top.yangluotong.concurrency;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyThread extends Thread {
    @Override
    public void run() {
        int time = (int) (Math.random() * 1000);
        try {
            for (int i = 0; i < 20; i++) {
                Thread.sleep(time);
                System.out.println("current thread name:" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            log.info("hell world");
        }
    }
}
