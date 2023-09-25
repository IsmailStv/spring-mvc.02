package ru.javamentor.springmvc.dao;

import org.springframework.stereotype.Component;
import ru.javamentor.springmvc.model.User;


import java.util.List;

@Component
public interface UserDao {
    List<User> getUsers();
    User showUser(Long id);
    void deleteUser(Long id);
    void saveUser(User user);
    void updateUser(User user);
}
