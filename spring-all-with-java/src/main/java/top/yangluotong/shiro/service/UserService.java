package top.yangluotong.shiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangluotong.shiro.dao.UserDao;
import top.yangluotong.shiro.domain.User;

@Service
public class UserService {

    @Autowired
    public UserDao userDao;

    public User selectUserByName(String name) {
        return userDao.selectUserInfoByName(name);
    }

    public int selectUserCount() {
        return userDao.selectUserCount();
    }
}
