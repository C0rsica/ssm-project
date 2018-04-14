package create.strategy;

import java.math.BigDecimal;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 上午10:34
 */
public interface ProductActivity {

  BigDecimal calc(int unitPrice, int amount);
}
