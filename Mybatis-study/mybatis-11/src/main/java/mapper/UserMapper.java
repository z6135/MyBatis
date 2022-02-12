package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getAll();

    int insertUser(User user);

    int updataUser(User user);

    int deleteUser(int id);
}
