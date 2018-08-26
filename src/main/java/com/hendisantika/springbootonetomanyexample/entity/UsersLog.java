package com.hendisantika.springbootonetomanyexample.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-many-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/08/18
 * Time: 15.21
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "users_log", catalog = "test")
@Entity
public class UsersLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id")
    private Integer id;

    private String log;

    @Column(name = "user_id")
    private Integer userId;

    public UsersLog() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}