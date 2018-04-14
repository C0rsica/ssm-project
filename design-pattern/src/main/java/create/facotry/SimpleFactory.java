package create.facotry;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午1:50
 */
public class SimpleFactory {

  /*
  简单工厂
  1.定义接口
  2.子类实现接口
  3.定义工厂
  4.工厂定义方法指定生成的子类
  5.使用
   */
  public Shape getShape(String shapeType) {
      /*if(shapeType.equals("")){
        return
      }*/
    Shape newShape;
    switch (shapeType) {
      case "Circle":
        newShape = new Circle();
        break;
      case "Rectangle":
        newShape = new Rectangle();
        break;
      case "Square":
        newShape = new Square();
        break;
      default:
        newShape = null;
    }
    return newShape;
  }

  public static void main(String[] args) {
      SimpleFactory factory = new SimpleFactory();
    Shape circle = factory.getShape("11");
    circle.draw();


  }
}
