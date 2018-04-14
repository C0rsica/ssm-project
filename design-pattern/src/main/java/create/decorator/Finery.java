package create.decorator;

/**
 * 服饰类
 * @author corsica
 * @date 2018/4/9
 * @time 上午11:37
 */
public class Finery extends Person {

  Person person;

  public void Decorator(Person person) {
    this.person = person;
  }

  @Override
  public void show() {
    if (person != null) {
      person.show();
    }
  }
}
