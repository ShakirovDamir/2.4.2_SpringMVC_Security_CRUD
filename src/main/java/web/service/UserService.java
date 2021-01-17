package web.service;

import web.model.Role;
import web.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> listUsers();
    void add(User user);
    void delete(Long id);
    void update(User user);
    User getById (Long id);
    void createRole(Set<Role> roles);
    Set<Role> getAllRoles();
    User getUserByName(String name);
}
