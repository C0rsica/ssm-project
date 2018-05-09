package top.yangluotong.sync;

import top.yangluotong.generic.MyGeneric;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Sync {
    public static void main(String[] args) throws IllegalAccessException {
        Runnable hello = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("hello " + i);
            }
        };
        Runnable say = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("say " + i);
            }
        };

        Executor executor = Executors.newCachedThreadPool();
        //executor.execute(hello);
       // executor.execute(say);

        LinkedBlockingDeque<Integer> queue = new LinkedBlockingDeque<>();
        queue.offer(1);
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();
        ConcurrentSkipListMap<String, String> listMap = new ConcurrentSkipListMap();
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong =new AtomicLong();
        atomicLong.incrementAndGet();
        //取值  +1  设值  整个操作无法打断
        AtomicReference<MyGeneric> j = new AtomicReference<>();

        Lock lock =new ReentrantLock();

        throw new IllegalAccessException();

    }
}
