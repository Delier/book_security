package com.dl.book_security.pojo;

import javax.persistence.*;
import java.util.List;

@Entity(name = "menu")
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "menuName")
    private String menuName;
    @Column(name = "pattern")
    private String pattern;
    @ManyToMany
    @JoinTable(
            name = "menu_role",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> RoleList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public List<Role> getRoleList() {
        return RoleList;
    }

    public void setRoleList(List<Role> roleList) {
        RoleList = roleList;
    }

    @Override
    public String toString() {
        String str = "Menu{ id=" + id + ", menuName='" + menuName  + ", pattern='" + pattern;
        StringBuilder sb = new StringBuilder(str);
        sb.append(", RoleList= [");
        for (Role role : RoleList) {
            sb.append(role.getRoleName());
            sb.append(",");
        }
        sb.append("] }");
        return sb.toString();
    }
}
