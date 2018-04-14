package create.state;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午1:54
 */
public class StateA extends State {

  @Override
  void handle(Context context) {
    System.out.println("now is State a ,go on....");
    context.state = new StateB();
  }
}
