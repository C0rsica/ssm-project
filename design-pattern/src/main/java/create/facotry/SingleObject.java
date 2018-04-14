package create.facotry;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午2:07
 */
public class SingleObject {

  /*
  1.private 构造函数,无法new
  2.static静态变量

  模式:
  1.懒汉式 线程不安全  lazy初始化
  2.懒汉  线程安全
  3.饿汉
   */
  private static volatile SingleObject instance;

  private SingleObject() {
  }


  public static SingleObject getInstance() {
    if (instance == null) {
      synchronized (SingleObject.class) {
        if (instance == null) {
          return new SingleObject();
        }
      }
    }
    return instance;
  }


  public static void main(String[] args) {
    SingleObject.getInstance();
  }
}
