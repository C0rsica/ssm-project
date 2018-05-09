package top.yangluotong.shiro.dao;

import top.yangluotong.shiro.domain.User;

public interface UserDao {
    User selectUserInfoByName(String username);

    int selectUserCount();
}
