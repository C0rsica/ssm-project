package top.yangluotong.ssm.dao;

import java.util.List;
import top.yangluotong.ssm.domain.MyClass;

/**
 * @author corsica
 * @date 2018/4/6
 * @time 上午12:06
 */

public interface MyClassDao {
  List<MyClass> selectAll();
}
