package create.observe;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午1:42
 */
public class Hr implements Observer {

  @Override
  public void update() {
    System.out.println("HR:我要拍老板马屁了");
  }
}
