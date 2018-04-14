package create.proxy;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午12:06
 */
public class Me implements Gift {

  private String name;

  public Me(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void giveToy() {
    System.out.println(name + " give you a toy");
  }

  @Override
  public void giveFlower() {
    System.out.println(name + " give you a flower");

  }

  @Override
  public void giveChocolate() {
    System.out.println(name + " give you a chocolate");

  }
}
