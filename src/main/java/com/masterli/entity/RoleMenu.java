package com.masterli.entity;

import javax.persistence.*;

/**
 * @Author: masterli
 * @Date: 2021/4/19 18:30
 * 菜单和角色实体关联(中间表)，根据角色来使用不同菜单
 */

@Entity
@Table(name = "t_role_menu")
public class RoleMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "menuId")
    private Menu menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
