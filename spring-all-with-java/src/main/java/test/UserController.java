package test;

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

    @RequestMapping("/login")
    public String login() {
        System.out.println(userService != null);
        log.info("userSevice is null:{}",userService != null);
        return "home";
    }

    @RequestMapping("")
    public String index() {
        return "index";
    }

}
