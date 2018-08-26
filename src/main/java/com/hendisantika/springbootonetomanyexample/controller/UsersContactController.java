package com.hendisantika.springbootonetomanyexample.controller;

import com.hendisantika.springbootonetomanyexample.entity.Users;
import com.hendisantika.springbootonetomanyexample.entity.UsersContact;
import com.hendisantika.springbootonetomanyexample.entity.UsersLog;
import com.hendisantika.springbootonetomanyexample.repository.UsersContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-many-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/08/18
 * Time: 15.26
 * To change this template use File | Settings | File Templates.
 */

@RequestMapping("/rest/userscontact")
@RestController
public class UsersContactController {
    @Autowired
    private UsersContactRepository usersContactRepository;


    @GetMapping(value = "/all")
    public List<UsersContact> getUsersContact() {
        return usersContactRepository.findAll();
    }

    @GetMapping(value = "/update/{name}")
    public List<UsersContact> update(@PathVariable final String name) {

        UsersContact usersContact = new UsersContact();
        Users users = new Users();
        UsersLog usersLog = new UsersLog();
        usersLog.setLog("HI Youtube");

        UsersLog usersLog2 = new UsersLog();
        usersLog2.setLog("HI Viewers");

        users.setTeamName("Development");
        users.setSalary(10000);
        users.setName(name);
        users.setUsersLogs(Arrays.asList(usersLog, usersLog2));

        usersContact.setPhoneNo(11111);
        usersContact.setUsers(users);

        //persist
        usersContactRepository.save(usersContact);

        //getall
        return usersContactRepository.findAll();


    }

}
