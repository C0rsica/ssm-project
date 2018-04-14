package create.decorator;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午11:41
 */
public class Shoe extends Finery {

  @Override
  public void show() {
    System.out.println("您获得了一双🦂");
    super.show();
  }
}
