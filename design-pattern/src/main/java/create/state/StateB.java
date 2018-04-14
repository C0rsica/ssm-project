package create.state;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午1:54
 */
public class StateB extends State {

  @Override
  void handle(Context context) {
    System.out.println("now is State b, go on....");
    context.state = new StateC();
  }
}
