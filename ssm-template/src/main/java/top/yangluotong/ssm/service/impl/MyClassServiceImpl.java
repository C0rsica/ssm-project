package top.yangluotong.ssm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangluotong.ssm.dao.MyClassDao;
import top.yangluotong.ssm.domain.MyClass;
import top.yangluotong.ssm.service.MyClassService;

/**
 * @author corsica
 * @date 2018/4/6
 * @time 上午12:21
 */
@Service
public class MyClassServiceImpl implements MyClassService {

  @Autowired
  MyClassDao myClassDao;

  public List<MyClass> selectAll() {
    return myClassDao.selectAll();
  }

}
