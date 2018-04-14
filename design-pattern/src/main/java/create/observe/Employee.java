package create.observe;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午1:40
 */
public class Employee implements Observer {

  @Override
  public void update() {
    System.out.println("Employee:老板来了!我开始工作");
  }
}
