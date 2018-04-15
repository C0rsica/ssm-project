package aop;

import org.springframework.stereotype.Component;

@Component
public class DoSomecalu implements Performance {
    public void perform() throws AopException {
        System.out.println("2+1=3");
        throw new AopException("11123");
    }
}
