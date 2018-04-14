package create.decorator;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午11:40
 */
public class TShirt extends Finery {

  @Override
  public void show() {
    System.out.println("您获得了一件👕");
    super.show();
  }
}
