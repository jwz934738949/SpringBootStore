package cn.edu.sdut.springbootstore.controller;

import cn.edu.sdut.springbootstore.entity.User;
import cn.edu.sdut.springbootstore.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    public static String SUCCESS = "redirect:queryUsers";

    @RequestMapping("queryUsers")
    public String queryUsers(User user, ModelMap modelMap) {
        List<User> users = this.userService.queryUsers(user);
        modelMap.put("users", users);
        return "user/listUser";
    }

    @RequestMapping("toAddUser")
    public String toAdd() {
        return "user/addUser";
    }

    @RequestMapping("doAddUser")
    public String doAdd(User user) {
        this.userService.addUser(user);
        return SUCCESS;
    }

    @RequestMapping("ajaxQueryUserByUsername")
    @ResponseBody
    public boolean ajaxQueryUserByUsername(String username) {
        User user = this.userService.queryUserByUsername(username);
        if (user != null) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("detailUser")
    public String detailUser(int userid, ModelMap modelMap) {
        User user = this.userService.queryUserById(userid);
        modelMap.put("user", user);
        return "user/detailUser";
    }

    @RequestMapping("toUpdateUser")
    public String toUpdate(int userid, ModelMap modelMap) {
        User user = this.userService.queryUserById(userid);
        modelMap.put("user", user);
        return "user/updateUser";
    }

    @RequestMapping("doUpdateUser")
    public String doUpdate(User user) {
        this.userService.updateUser(user);
        return SUCCESS;
    }

    @RequestMapping("deleteUser")
    public String deleteUser(int userid) {
        this.userService.deleteUser(userid);
        return SUCCESS;
    }
}
