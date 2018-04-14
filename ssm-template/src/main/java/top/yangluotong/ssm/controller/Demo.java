package top.yangluotong.ssm.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.yangluotong.ssm.domain.MyClass;
import top.yangluotong.ssm.service.MyClassService;

/**
 * @author corsica
 * @date 2018/4/5
 * @time 下午11:40
 */
@Controller
@RequestMapping("/demo")
public class Demo {

  @Autowired
  MyClassService classService;

  @RequestMapping("/index")
  @ResponseBody
  public String sayHello() {
    return "Hello,kai";
  }

  @RequestMapping("/selectAll")
  @ResponseBody
  public String selectClassList() {
    List<MyClass> list = classService.selectAll();
    Optional<MyClass> data = list.stream().findFirst();
    if (!data.isPresent()) {
      return "error";
    }
    return data.get().toString();
  }

}
