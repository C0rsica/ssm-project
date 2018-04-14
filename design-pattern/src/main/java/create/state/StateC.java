package create.state;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午1:54
 */
public class StateC extends State {

  @Override
  void handle(Context context) {
    System.out.println("now is State C, go on....");
    context.state = new StateA();
  }
}
