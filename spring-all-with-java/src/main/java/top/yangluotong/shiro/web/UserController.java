package top.yangluotong.shiro.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.yangluotong.shiro.service.UserService;

@Slf4j
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("")
    public String login() {
        System.out.println(userService != null);
//        log.info("userSevice is null:{}", userService != null);
        log.info("userName is :{}", userService.selectUserByName("corsica").getUsername());
        log.info("passowrd is :{}", userService.selectUserByName("corsica").getPassword());
        log.info("age is :{}", userService.selectUserByName("corsica").getAge());
//        log.info("hello is :{}", hello.selectUserByName("hello").getUsername());
        log.info("selectCount:{}", userService.selectUserCount());
        return "home";
    }

    @RequestMapping("/login")
    public String index() {
        return "index";
    }

}
