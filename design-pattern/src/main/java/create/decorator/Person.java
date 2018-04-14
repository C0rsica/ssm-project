package create.decorator;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午11:30
 */
public class Person {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void show() {
    System.out.println(String.format("装扮的人是:%s",name));
  }


  public static void main(String[] args) {
    Person p =new Person();
    p.setName("corsica");
    Finery shoe = new Shoe();
    shoe.Decorator(p);
    Finery tshirt= new TShirt();
    tshirt.Decorator(shoe);
    tshirt.show();
  }

}
