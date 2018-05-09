package top.yangluotong.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

public class SoldTicket {

    public static AtomicLong stock = new AtomicLong(10000);//售票系统有1000张票

    public static final Integer threadCount = 10000; //模拟100个请求

    public Boolean soldTicket() {
        stock.decrementAndGet();
        return true;
    }


    public static void main(String[] args) throws InterruptedException {
        /*for (int i = 0; i < SoldTicket.threadCount; i++) {
            //多线程版本
            TicketClient client = new TicketClient();
            client.setName("ticket" + i);
            client.start();

            //单线程版本
           *//* SoldTicket ticket = new SoldTicket();
            ticket.soldTicket();
            System.out.println("线程:" + Thread.currentThread().getName() + " 获取1张票");*//*
        }
        Thread.sleep(1000);
        System.out.println("当前的库存:" + SoldTicket.stock);*/


        //为什么高并发下  库存没减?
        /**
         * 思考:stock--
         * step1: 获取stock
         * step2: stock - 1
         * step3: 赋值stock
         *
         * 模拟:
         * 线程1:获取stock=10 => stock -1 =9 =>赋值stock=9
         * 线程2:获取stock=10 => stock -1 =9 =>赋值stock=9
         *
         * 分析:正常应该两个线程消耗2张票, stock =10-2 = 8 ;多线程:stock = 9
         *
         *
         */

       /* new Thread(new RunableThreadTest()).start();

        Runnable another_runnable_test = () -> System.out.println("another runnable test");

        Runnable lambda_runnable = () -> {
            System.out.println("start...");
            System.out.println("say hello");
            System.out.println("end...");
        };
        new Thread(lambda_runnable).start();*/
//        normal();
        for (int i = 0; i < 10; i++) {
            currency();
        }


    }

    public static void normal() {
        long start = System.currentTimeMillis();
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            /*System.out.println("线程:" + Thread.currentThread().getName()
                    + "开始执行任务....");
            System.out.println("Get DATA from Mysql");*/
            ids.add(UUID.randomUUID().toString());
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("非并发版本耗时:" + end + "ms");
    }

    public static void currency() {
        long start = System.currentTimeMillis();
        Callable<String> callable = () -> {
            /*System.out.println("线程:" + Thread.currentThread().getName()
                    + "开始执行任务....");
            System.out.println("Get DATA from Mysql");*/
            return UUID.randomUUID().toString();
        };
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<>();
        //Create MyCallable instance
        for (int i = 0; i < 1000000; i++) {
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        /*for (Future<String> fut : list) {
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }*/
        //shut down the executor service now
        executor.shutdown();
        long totalTime = System.currentTimeMillis() - start;
        System.out.println("并发版本耗时:" + totalTime + "ms");
    }


}



