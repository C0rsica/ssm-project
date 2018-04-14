package create.state;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午1:53
 */
public class Context {

  State state;

  public State getState() {
    return state;
  }

  public Context(State state) {
    this.state = state;
  }

  public void setState(State state) {
    this.state = state;
  }

  void request() {
    state.handle(this);
  }

  public static void main(String[] args) {
    Context context = new Context(new StateA());
    context.request();
    context.request();
    context.request();
    context.request();
    context.request();
    context.request();
    context.request();

  }

}
