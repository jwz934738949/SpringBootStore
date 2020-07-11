package cn.edu.sdut.springbootstore.user;

import cn.edu.sdut.springbootstore.SpringbootstoreApplicationTests;
import cn.edu.sdut.springbootstore.entity.User;
import cn.edu.sdut.springbootstore.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestUser extends SpringbootstoreApplicationTests {
    @Resource
    private UserService userService;

    @Test
    public void testQueryUsers() {
        User user = new User();
        user.setUsername("admin");
        user.setUserroles("3");
        List<User> users = this.userService.queryUsers(user);
        users.forEach(u -> System.out.println("u = " + u));
    }

    @Test
    public void testQueryUserById() {
        int userid = 1;
        User user = this.userService.queryUserById(userid);
        System.out.println("user = " + user);
    }

    @Test
    public void testLogin() {
        User admin = new User("admin", "123");
        User login = this.userService.login(admin);
        System.out.println("login = " + login);
    }

    @Test
    public void testQueryUserByUsername() {
        String username = "admin";
        User user = this.userService.queryUserByUsername(username);
        System.out.println("user = " + user);
    }

    @Test
    public void testAddUser() {
        User user = new User(0, "qilin", "00123", "2", null);
        this.print(this.userService.addUser(user));
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setUserid(6);
        user.setPassword("abc123");
        user.setUserroles("2");
        this.print(this.userService.updateUser(user));
    }

    @Test
    public void testDeleteUser() {
        int userid = 6;
        this.print(this.userService.deleteUser(userid));
    }

}
