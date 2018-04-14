package create.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午1:37
 */
public class Boss implements Subject {

  List<Observer> subjects = new ArrayList<>();

  @Override
  public void add(Observer observer) {
    subjects.add(observer);
  }

  @Override
  public void remove(Observer observer) {
    subjects.remove(observer);
  }

  @Override
  public void doAction() {
    System.out.println("BOSS:我去检查员工的工作");
    subjects.forEach(x -> x.update());
  }


  public static void main(String[] args) {
    Subject subject = new Boss();
    Observer employee = new Employee();
    //添加订阅者1
    subject.add(employee);
    //添加订阅者2
    subject.add(new Hr());
    subject.doAction();


  }
}
