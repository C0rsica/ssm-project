package create.iterator;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午2:44
 */
public class ConcreateIterator extends Iterator {

  ConcreateAggregate aggregate;

  int current;

  public ConcreateIterator(ConcreateAggregate aggregate) {
    this.aggregate = aggregate;
  }


  @Override
  public Object first() {
    return null;
  }

  @Override
  public Object Next() {
    return null;
  }

  @Override
  public Object isDone() {
    return null;
  }

  @Override
  public Object curretnItem() {
    return null;
  }
}
