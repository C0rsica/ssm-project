package top.yangluotong.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyReententLock {


    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }


    }

}
