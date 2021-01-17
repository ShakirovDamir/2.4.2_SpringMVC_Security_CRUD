package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> listUsers();
    void add(User user);
    void delete(Long id);
    void update(User user);
    User getById (Long id);
    User getUserByName(String name);

}
