package ru.crudboot.kata3_1_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.crudboot.kata3_1_2.dao.UserDao;
import ru.crudboot.kata3_1_2.models.User;


import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional(readOnly = true)
    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional(readOnly = true)
    @Override
    public User showUser(Integer id) {
        return userDao.showUser(id);
    }
    @Transactional
    @Override
    public void updateUser(Integer id, User userUpdated) {
        userDao.updateUser(id,userUpdated);
    }
    @Transactional
    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }
}
