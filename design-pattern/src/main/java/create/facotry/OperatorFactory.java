package create.facotry;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午10:14
 */
public class OperatorFactory {

  public Operator getOperatorByType(String sign) {
    Operator operator = null;
    switch (sign) {
      case "+":
        operator = new Add();
        break;
      case "-":
//        result = a - b;
        break;
      case "*":
//        result = a * b;
        break;
      case "/":
//        result = a / b;
        break;
      default:
//        result = 0;
    }
    return operator;
  }

  public static void main(String[] args) {
    OperatorFactory factory = new OperatorFactory();
    Operator operatorByType = factory.getOperatorByType("+");
    System.out.println(operatorByType.calc(1, 2));
  }

}
