package create.strategy;

import java.math.BigDecimal;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午11:01
 */
public class ActivityContext {

  private ProductActivity productActivity;

  public ActivityContext(ActivityType sign) {
    switch (sign) {
      case FULL:
        productActivity = new Full();
        break;
      case DICOUNT:
        productActivity = new Discount();
        break;
      default:
        productActivity = null;
    }
  }

  public BigDecimal calc(int a, int b) {
    return productActivity.calc(a, b);
  }


  public static void main(String[] args) {
    ActivityContext context = new ActivityContext(ActivityType.DICOUNT);
    System.out.println(context.calc(10,10));
    ActivityContext context1 = new ActivityContext(ActivityType.FULL);
    System.out.println(context1.calc(10,10));

    /*数据表结构设计
    rule  1
    满减  满 xx  减 yy
    满减  满 xx  减 yy
    满减  满 xx  减 yy

    rule 2
    满100 8折
    满200 7折
    满200 3折

    rule 3
    满100 送20
    满100 送2
    满100 送1

    优化活动类
     */



  }

}
