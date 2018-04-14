package create.strategy;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午10:39
 */
public class ActivityFactory {


  public ProductActivity getActivityByType(ActivityType sign) {
    ProductActivity productActivity;
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
    return productActivity;
  }


  public static void main(String[] args) {
    ActivityFactory factory = new ActivityFactory();
    ProductActivity activityByType = factory.getActivityByType(ActivityType.FULL);
    System.out.println(activityByType.calc(100, 100));
    ProductActivity activityByType1 = factory.getActivityByType(ActivityType.DICOUNT);
    System.out.println(activityByType1.calc(100, 100));


  }

}
