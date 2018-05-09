package top.yangluotong.concurrency;

public class TicketClient extends Thread {
    @Override
    public void run() {
        SoldTicket ticket = new SoldTicket();
        ticket.soldTicket();
        System.out.println("线程:" + Thread.currentThread().getName() + " 获取1张票");
    }
}
