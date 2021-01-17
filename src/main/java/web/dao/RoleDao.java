package web.dao;

import web.model.Role;

import java.util.Set;

public interface RoleDao {
    void createRole(Set<Role> roles);
    Set<Role> getAllRoles();
}
