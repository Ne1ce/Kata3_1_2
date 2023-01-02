package ru.crudboot.kata3_1_2.service;


import ru.crudboot.kata3_1_2.models.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void addUser(User user);
    User showUser(Integer id);
    void updateUser(Integer id,User userUpdated);
    void deleteUser(Integer id);
}
