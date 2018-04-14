import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DemoService;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午6:57
 */
public class Consumer {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "consumer.xml");
    context.start();
    // obtain proxy object for remote invocation
    DemoService demoService = (DemoService) context.getBean("demoService");
    // execute remote invocation
    String hello = demoService.sayHello("world");
    // show the result
    System.out.println(hello);
  }

}
