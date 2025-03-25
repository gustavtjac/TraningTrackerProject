package com.example.trainingloggerapp.Service;


import com.example.trainingloggerapp.Models.User;
import com.example.trainingloggerapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
private UserRepository userRepository;



    public User checkIfLoginInfoIsCorrect(String username,String password){
        return userRepository.checkIfLoginInfoIsCorrect(username,password);
    }





}
