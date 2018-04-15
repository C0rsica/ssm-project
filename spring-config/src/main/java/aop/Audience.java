package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * this is a 切面
 */

@Aspect
public class Audience {

    @Pointcut(value = "execution(* aop.Performance.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("silencing cell phones");
    }


    @Before("performance()")
    public void takeSeats() {
        System.out.println("take seats!");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund!");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("proceed  before");
            joinPoint.proceed();
            System.out.println("proceed  after");

        } catch (Throwable throwable) {
            System.out.println("proceed  exception");
            throwable.printStackTrace();
        }
    }
}
