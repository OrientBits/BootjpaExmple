package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.Serializable;

@SpringBootApplication
public class BootJpaExampleApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BootJpaExampleApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);

        User user = new User();
        user.setName("Ramshek Rana");
        user.setCity("Hazaribagh");
        user.setStatus("I am java programmer");

        User user1 = userRepository.save(user);

        System.out.println(userRepository);
        System.out.println(user1);

    }


}
