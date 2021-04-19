package com.masterli.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: masterli
 * @Date: 2021/4/19 17:50
 * 角色类，用户的角色
 */

@Entity
@Table(name = "t_a_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(length = 30)
    private String name;

    @NotNull
    @Column(length = 10)
    private Integer orderNo;

    //创建时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    //修改时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}
