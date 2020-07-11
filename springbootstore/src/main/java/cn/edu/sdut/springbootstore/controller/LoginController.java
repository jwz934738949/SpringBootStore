package cn.edu.sdut.springbootstore.controller;

import cn.edu.sdut.springbootstore.entity.User;
import cn.edu.sdut.springbootstore.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String toLogin() {
        return "index";
    }

    @RequestMapping("doLogin")
    public String doLogin(User user, HttpSession httpSession, ModelMap modelMap) {
        String forward = "";
        User login = this.userService.login(user);
        if(login != null){
            httpSession.setAttribute("user", login);
            forward = "main/main";
        }else{
            String msg = "对不起，您输入的用户名或密码有误";
            modelMap.put("msg", msg);
            forward = "index";
        }
        return forward;
    }
}
