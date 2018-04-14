package create.adapter;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午2:03
 */
public class Adapter extends Target {

  Source source = new Source();

  @Override
  void targetRequet() {
    source.sourceRequst();
  }

  public static void main(String[] args) {
    //适配器模式
    //适配器集成target类  改写target类的行为
    Target target = new Adapter();
    target.targetRequet();
  }
}
