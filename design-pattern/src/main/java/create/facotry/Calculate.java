package create.facotry;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午10:04
 */
public class Calculate {

  public static int calc(int a, int b, String sign) {
    int result = 0;
    switch (sign) {
      case "+":
        result = a + b;
        break;
      case "-":
        result = a - b;
        break;
      case "*":
        result = a * b;
        break;
      case "/":
        result = a / b;
        break;
      default:
        result = 0;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(Calculate.calc(1,2,"+"));
  }

}
