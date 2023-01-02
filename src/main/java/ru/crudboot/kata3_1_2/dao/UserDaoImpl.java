package ru.crudboot.kata3_1_2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import ru.crudboot.kata3_1_2.models.User;

import java.util.List;


@Component
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> allUsers() {
        return entityManager.createQuery("select u from User u", User.class)
                .getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User showUser(Integer id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public void updateUser(Integer id, User userUpdated) {
        User userToUpdate = showUser(id);
        userToUpdate.setName(userUpdated.getName());
        userToUpdate.setSurName(userUpdated.getSurName());
        userToUpdate.setEmail(userUpdated.getEmail());
        entityManager.merge(userToUpdate);

    }

    @Override
    public void deleteUser(Integer id) {
            entityManager.remove(showUser(id));
    }
}
