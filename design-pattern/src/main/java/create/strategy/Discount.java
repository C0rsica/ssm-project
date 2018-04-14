package create.strategy;

import java.math.BigDecimal;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午10:36
 */
public class Discount implements ProductActivity {

  private BigDecimal discount = new BigDecimal(0.8);

  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  @Override
  public BigDecimal calc(int unitPrice, int amount) {
    return new BigDecimal(unitPrice * amount).multiply(discount).setScale(2, 2);
  }
}
