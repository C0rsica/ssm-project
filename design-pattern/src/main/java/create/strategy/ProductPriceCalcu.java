package create.strategy;

import java.math.BigDecimal;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午10:19
 */
public class ProductPriceCalcu {

  private int unitPrice;
  private int amount;
  private BigDecimal discount;

  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public ProductPriceCalcu(int unitPrice, int amount, BigDecimal discount) {
    this.unitPrice = unitPrice;
    this.amount = amount;
    this.discount = discount;
  }

  public ProductPriceCalcu(int unitPrice, int amount) {
    this.unitPrice = unitPrice;
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }

  public int getTotal() {
    return unitPrice * amount;
  }

  public BigDecimal getTotal1() {
    BigDecimal total = new BigDecimal(unitPrice * amount);
    return total.multiply(discount);
  }


  public static void main(String[] args) {
    //1.无折扣
    ProductPriceCalcu calcu = new ProductPriceCalcu(100, 10);
    System.out.println(calcu.getTotal());
    //2.增加折扣   总价*折扣
    ProductPriceCalcu calcu1 = new ProductPriceCalcu(100, 10, new BigDecimal(0.1));
    System.out.println(calcu1.getTotal1().setScale(2,BigDecimal.ROUND_FLOOR));
  }
}
