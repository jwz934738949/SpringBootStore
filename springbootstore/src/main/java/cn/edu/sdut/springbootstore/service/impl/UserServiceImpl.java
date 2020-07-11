package cn.edu.sdut.springbootstore.service.impl;

import cn.edu.sdut.springbootstore.entity.User;
import cn.edu.sdut.springbootstore.mapper.UserMapper;
import cn.edu.sdut.springbootstore.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper usermapper;

    @Override
    public List<User> queryUsers(User user) {
        return this.usermapper.queryUsers(user);
    }

    @Override
    public User queryUserById(int userid) {
        return this.usermapper.queryUserById(userid);
    }

    @Override
    public User login(User user) {
        return this.usermapper.login(user);
    }

    @Override
    public User queryUserByUsername(String username) {
        return this.usermapper.queryUserByUsername(username);
    }

    @Override
    public int addUser(User user) {
        return this.usermapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return this.usermapper.updateUser(user);
    }

    @Override
    public int deleteUser(int userid) {
        return this.usermapper.deleteUser(userid);
    }
}
