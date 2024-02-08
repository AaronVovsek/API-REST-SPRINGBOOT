package com.JavaEjercicio10.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEjercicio10.models.UserModel;
import com.JavaEjercicio10.services.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> GetUsers() {
        return userService.GetUsers();
    }
    
    @PostMapping()
    public UserModel CreateUser(@RequestBody UserModel User) {
        return userService.SaveUser(User);
    } 
    
    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean ok = userService.DeleteUser(id);
        if(ok) return "Se elimino el usuario "+ id;
        return "No se elimino el usuario "+ id;
    }

    
    
}
