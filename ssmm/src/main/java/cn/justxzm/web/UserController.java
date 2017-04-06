package cn.justxzm.web;

import cn.justxzm.model.User;
import cn.justxzm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by XZM on 2017/3/30.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("register")
    public boolean register(@RequestParam("username")String username,
                            @RequestParam("password")String password){
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        boolean isRegisterSuccess=userService.register(user);
        return isRegisterSuccess;
    }

    @RequestMapping("login")
    public ModelAndView login(@RequestParam("username")String username,
                              @RequestParam("password")String password) {
        User user = userService.login(username, password);

        ModelAndView modelAndView = new ModelAndView();
        if (user == null) {
            modelAndView.addObject("message", "用户不存在或者密码错误！");
            modelAndView.setViewName("error");
        } else {
            modelAndView.addObject("user", user);
            modelAndView.setViewName("userinfo");
        }
        return modelAndView;
    }
}
