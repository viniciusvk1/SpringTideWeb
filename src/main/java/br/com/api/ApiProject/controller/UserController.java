package br.com.api.ApiProject.controller;

import br.com.api.ApiProject.DAO.UserRepository;
import br.com.api.ApiProject.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController{

    @Autowired
    private UserRepository dao;

    @GetMapping("/user")
    public List<User> usersList() {
        return (List<User>) dao.findAll();
    }


}