package com.hendisantika.springbootonetomanyexample;

import com.hendisantika.springbootonetomanyexample.entity.Users;
import com.hendisantika.springbootonetomanyexample.entity.UsersLog;
import com.hendisantika.springbootonetomanyexample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootOneToManyExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOneToManyExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner initializeData(@Autowired UsersRepository usersRepository) {
        return args -> {
            usersRepository.save(new Users(1, "Uzumaki Naruto", 2500, "Team 7", Arrays.asList(new UsersLog(1, "Hi naruto!", 1))));
            usersRepository.save(new Users(2, "Sakura Haruno", 3500, "Team 7", Arrays.asList(new UsersLog(2, "Hi naruto!", 2))));
            usersRepository.save(new Users(3, "Uchiha Sasuke", 4500, "Team 7", Arrays.asList(new UsersLog(3, "Hi naruto!", 3))));
            usersRepository.save(new Users(4, "Sabaku No Gaara", 5500, "Team 1", Arrays.asList(new UsersLog(4, "Hi naruto!", 4))));
            usersRepository.save(new Users(5, "Inuzuka Kiba", 2600, "Team 2", Arrays.asList(new UsersLog(5, "Hi naruto!", 5))));
        };
    }
}
