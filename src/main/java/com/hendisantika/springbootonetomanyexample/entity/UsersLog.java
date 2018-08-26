package com.hendisantika.springbootonetomanyexample.entity;

import lombok.*;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class UsersLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id")
    private Integer id;

    private String log;

    @Column(name = "user_id")
    private Integer userId;
}