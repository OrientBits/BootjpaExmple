package com.jpa.test.dao;

import com.jpa.test.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {


    // creating custom methods
    public List<User> findByName(String name);
    public List<User> findByNameAndCity(String name, String city);
    public List<User> findByNameStartingWith(String prefix);
    public List<User> findByNameEndingWith(String suffix);
    public List<User> findByNameContaining(String works);
    public List<User> findByNameLike(String likePattern);

    //public List<User> findByAgeIn(Collection<Integer> ages);

    public List<User> findByNameOrderByName(String name);
    // and to many methods you can create here
    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation



    //creating custom method by using Query
    @Query("select u from User u")
    public List<User> getAllUser();

    @Query("SELECT u FROM User u  WHERE u.name =:n AND u.city =:c")
    public List<User> getUserByName(@Param("n") String name, @Param("c") String city);

    @Query(value = "SELECT * from user", nativeQuery = true)
    public List<User> getUsers();


}
