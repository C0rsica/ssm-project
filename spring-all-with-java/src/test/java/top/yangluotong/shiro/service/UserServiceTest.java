package top.yangluotong.shiro.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.UserController;

import static org.junit.Assert.*;

public class UserServiceTest {

    @org.junit.Test
    public void selectUserByName() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userController = (UserService) context.getBean("MyUserService");
        assertNotNull(userController);
    }
}