package com.masterli.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

/**
 * @Author: masterli
 * @Date: 2021/4/19 18:13
 * 菜单类
 */

@Entity
@Table(name = "t_menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10)
    private Integer pId;    //父菜单id 根是-1 自己创建id

    @Column(length = 50)
    private String name;    //菜单名称

    @Column(length = 200)
    private String url; //菜单地址

    @Column(length = 10)
    private Integer state;  //菜单节点类型    0根节点close    1叶子节点open

    @Column(length = 100)
    private String icon;    //图标

    @Column(length = 100)
    private String permissions; //对应的shiro权限 user:add   permissions也可以为中文

    @Column(length = 10)
    private Integer type;   //默认0选项卡内打开 1新窗口打开  2弹出窗口打开

    @Column(length = 50)
    private String divId;   //layui菜单id

    @NotNull
    @Column(length = 10)
    private Integer orderNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDivId() {
        return divId;
    }

    public void setDivId(String divId) {
        this.divId = divId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
}
