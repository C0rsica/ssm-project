package create.proxy;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午12:06
 */
public class MyProxy implements Gift {

  Me me;

  public MyProxy(Me me) {
    this.me = me;
  }

  @Override
  public void giveToy() {
    before();
    me.giveToy();
    after();
  }

  private void before(){
    System.out.println("hoho");
  }

  private void after(){
    System.out.println("haha");
  }

  @Override
  public void giveFlower() {
    me.giveFlower();
  }

  @Override
  public void giveChocolate() {
    me.giveChocolate();
  }


  public static void main(String[] args) {
    Me me = new Me("corsica");
    Gift proxy = new MyProxy(me);
    proxy.giveToy();
    proxy.giveFlower();
    proxy.giveChocolate();
  }
}
