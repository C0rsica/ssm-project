package top.yangluotong.ssm.service;

import java.util.List;
import org.springframework.stereotype.Service;
import top.yangluotong.ssm.domain.MyClass;

/**
 * @author corsica
 * @date 2018/4/6
 * @time 上午12:43
 */
public interface MyClassService {
  List<MyClass> selectAll();
}
