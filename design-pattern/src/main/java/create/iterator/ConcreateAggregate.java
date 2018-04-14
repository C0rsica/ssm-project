package create.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午2:46
 */
public class ConcreateAggregate extends Aggregate {

  List<Object> list = new ArrayList<>();

  @Override
  public Iterator createIterator() {
    return new ConcreateIterator(this);
  }
}
