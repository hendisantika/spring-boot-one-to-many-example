package com.hendisantika.springbootonetomanyexample.entity;

import javax.persistence.*;
import java.util.List;

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
@Entity
@Table(name = "users", catalog = "test")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "name")
    private String name;
    private Integer salary;
    private String teamName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private List<UsersLog> usersLogs;

    public Users() {
    }

    public List<UsersLog> getUsersLogs() {
        return usersLogs;
    }

    public void setUsersLogs(List<UsersLog> usersLogs) {
        this.usersLogs = usersLogs;
    }

    public Integer getId() {
        return id;
    }

    public Users setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Users setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Users setSalary(Integer salary) {
        this.salary = salary;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public Users setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
}