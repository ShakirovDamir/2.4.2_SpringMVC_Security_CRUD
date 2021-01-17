package web.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    private Long id;

    @Column
    private String role;

    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {}

    public Role(Long id) { this.id = id; }

    public Role(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    public Role(String role) {
        if (role.equals("ROLE_ADMIN")) {
            this.id = 1L;
        } else if (role.equals("ROLE_USER")) {
            this.id = 2L;
        }
        this.role = role;
    }

    @Override
    public String getAuthority() { return role; }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }

    public Set<User> getUsers() { return users; }

    public void setUsers(Set<User> users) { this.users = users; }
}
