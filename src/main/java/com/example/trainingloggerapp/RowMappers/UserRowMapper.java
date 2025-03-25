package com.example.trainingloggerapp.RowMappers;

import com.example.trainingloggerapp.Models.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user =  new User();
        user.setName(rs.getString("USER_NAME"));
        user.setPassword(rs.getString("USER_PASSWORD"));
        user.setUsername(rs.getString("USER_USERNAME"));
        return user;
    }
}
