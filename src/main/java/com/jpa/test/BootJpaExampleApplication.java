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
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BootJpaExampleApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BootJpaExampleApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);

//        User user = new User();
//        user.setName("Ramshek Rana");
//        user.setCity("Hazaribagh");
//        user.setStatus("I am java programmer");
//
//        User user1 = userRepository.save(user);
//
//        System.out.println(user1);

        User user2 = new User();
        user2.setName("Rohit2");
        user2.setCity("Delhi2");
        user2.setStatus("Learning Front end2");

        User user3 = new User();
        user3.setName("Mangal");
        user3.setCity("Banha");
        user3.setStatus("Learning Agriculture");
/*
        // single entity to save
        User resultUser = userRepository.save(user2);
        System.out.println("Saved User "+resultUser);

        // for multiple user
        List<User> user21 = List.of(user2, user3);
        Iterable<User> resultIterable = userRepository.saveAll(user21);
        resultIterable.forEach(System.out::println);

        */


/*        // update the user of id 11
        Optional<User> optional = userRepository.findById(22);
        if (optional.isPresent()) {
            User user = optional.get();
            user.setName("Manoj Rana");
            userRepository.save(user);
            System.out.println(user);

            System.out.println("Done!!");
        }else {
            System.out.println("User not available");
        }

        */


 /*
        //get all user
        Iterable<User> all = userRepository.findAll();
        all.forEach(System.out::println);

        System.out.println("----------------second way-------------------");
        for (User user : all) {
            System.out.println(user);
        }
*/


        // deleting the user element
//        userRepository.deleteById(3);
//        System.out.println("Deleted!");
/*

        Iterable<User> all = userRepository.findAll();
        all.forEach(System.out::println);
        // to delete all user from database
        // userRepository.deleteAll(all);

        // delete user who are not from Delhi city
        all.forEach(user -> {
            if (!user.getCity().equals("Delhi")){
                userRepository.deleteById(user.getId());
            }
        });
*/

//        List<User> ankit = userRepository.findByName("Rohit");
//        ankit.forEach(System.out::println);

        List<User> users3 = userRepository.getAllUser();
        users3.forEach(System.out::println);

        System.out.println("--------------------------------------------------------");

        List<User> users = userRepository.getUserByName("Ramshek","Kolkata");
        users.forEach(System.out::println);

        System.out.println("--------------------------------------------------------");
        userRepository.getUsers().forEach(System.out::println);

    }


}
