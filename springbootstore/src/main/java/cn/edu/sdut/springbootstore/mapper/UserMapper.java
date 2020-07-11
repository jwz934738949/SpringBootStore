package cn.edu.sdut.springbootstore.mapper;

import cn.edu.sdut.springbootstore.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> queryUsers(User user);

    User queryUserById(int userid);

    User login(User user);

    User queryUserByUsername(String username);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int userid);
}
