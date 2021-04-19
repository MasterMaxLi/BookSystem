package com.masterli.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: masterli
 * @Date: 2021/4/19 18:42
 * 书籍类型类
 */

@Entity
@Table(name = "t_book_type")
public class BookType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10)
    private String name;    //类型名称

    //创建时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    //修改时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;

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
}
