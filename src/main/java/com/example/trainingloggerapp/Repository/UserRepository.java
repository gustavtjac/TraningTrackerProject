package com.example.trainingloggerapp.Repository;


import com.example.trainingloggerapp.Models.User;
import com.example.trainingloggerapp.RowMappers.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User checkIfLoginInfoIsCorrect(String username,String password){
        User user;
        String sql = "Select * FROM USERS where USER_USERNAME = ? and USER_PASSWORD = ?";
        List<User> userList = jdbcTemplate.query(sql,new UserRowMapper(),username,password);
        if (userList.isEmpty()){
            user = null;
            return user;
        }else {
            user = userList.get(0);
            return user;
        }
    }













}
