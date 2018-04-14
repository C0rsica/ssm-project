package service.impl;

import org.springframework.stereotype.Service;
import service.DemoService;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午6:21
 */
@Service
public class DemoServiceImpl implements DemoService {

  @Override
  public String sayHello(String name) {
    return "hello:" + name;
  }
}
