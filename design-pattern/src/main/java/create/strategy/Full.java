package create.strategy;

import java.math.BigDecimal;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午10:41
 */
public class Full implements ProductActivity {

  @Override
  public BigDecimal calc(int unitPrice, int amount) {
    return new BigDecimal(unitPrice * amount).setScale(2,2);
  }
}
