package create.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午1:32
 */
public interface Subject {

  //增加订阅者
  void add(Observer observer);

  //删除订阅者
  void remove(Observer observer);

  //通知订阅者
  void doAction();

}
