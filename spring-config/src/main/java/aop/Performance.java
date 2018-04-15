package aop;

import org.springframework.stereotype.Component;

/**
 * this is a pointcut;
 */
@Component
public interface Performance {
     void perform() throws Exception;
}
