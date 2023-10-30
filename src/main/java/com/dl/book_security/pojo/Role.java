package com.dl.book_security.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "role")
@Table(name = "role")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "roleName")
    private String roleName;
    @Column(name = "roleCode")
    private String roleCode;
    @ManyToMany(mappedBy = "RoleList")
    private List<Menu> menuList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public String toString() {
        String str =  "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleCode='" + roleCode + '\'';
        StringBuilder sb = new StringBuilder(str);
        sb.append(", menuList= [");
        for (Menu menu : menuList) {
            sb.append(menu.getMenuName());
            sb.append(",");
        }
        sb.append("] }");
        return sb.toString();
    }
}
