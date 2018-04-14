package provider;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午6:27
 */
public class Provider {

  public static void main(String[] args) throws IOException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
    context.start();
    System.in.read(); // 按任意键退出
  }
}
