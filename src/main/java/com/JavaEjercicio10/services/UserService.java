package com.JavaEjercicio10.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JavaEjercicio10.models.UserModel;
import com.JavaEjercicio10.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> GetUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel SaveUser(UserModel user){
        return userRepository.save(user);
    }
    public boolean DeleteUser(Long id){
        try {
            userRepository.deleteById(id);
            return true; 
        } catch (Exception e) {
            return false;
        }
    }
}
